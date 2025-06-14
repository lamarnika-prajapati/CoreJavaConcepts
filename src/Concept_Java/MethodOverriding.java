package Concept_Java;

public class MethodOverriding
{
     protected void rateOfInterest(double rbi_rate)
    {
        System.out.println("RBI interest rate "+rbi_rate);
    }
}
class SBI extends MethodOverriding
{
    void rateOfInterest(double sbi_rate, int gst_rate) //not overriding as it is not having same method signature
    {
        System.out.println("SBI interest rate is "+ sbi_rate + "  " + gst_rate);
    }
}
class IDFC extends MethodOverriding
{
    public void rateOfInterest(double idfc_rate) // method overriding with the higher access modifiers,
    // we can use only equal or higher modifiers. we can't use lower modifiers of protected like private, default.
    {
        System.out.println("IDFC interest rate is "+ idfc_rate);

    }
}
class ICCI extends MethodOverriding
{
    protected void rateOfInterest(double icci_rate)// method overriding
    {
        System.out.println("ICCI interest rate is "+ icci_rate);

    }
}

class OverridingMain
{
    public static void main(String[] args) {
        MethodOverriding mo=new MethodOverriding();
        mo.rateOfInterest(8.5);

        SBI sb=new SBI();
        sb.rateOfInterest(2.3);
        sb.rateOfInterest(9.5,3);

        IDFC idf=new IDFC();
        idf.rateOfInterest(15.5);

        ICCI ic=new ICCI();
        ic.rateOfInterest(10.3);


    }
}