// These classes are created to access public instance variable from the same and another class but in same package
package Concept_Java;

public class PubicSpecifiers {
    public String college_Name;
    public void display()
    {
        System.out.println(college_Name);
    }

}
class PublicSpecifiers2 extends PubicSpecifiers
{
    public String college_Name2;

    public void display()
    {
        //through inheritance, the properties of parent class are directly accessible inside child class without creating an object
        System.out.println(college_Name);
        System.out.println(college_Name2);
    }
}
class PubicSpecifiers1 {
    public String college_Name1;
    public static void main(String[] args) {
        //public instance variable is accessed from the same class
        PubicSpecifiers1 ps1=new PubicSpecifiers1();
        ps1.college_Name1="Marwar";
        System.out.println(ps1.college_Name1);

        //public instance variable is accessed from the another public class
        PubicSpecifiers ps=new PubicSpecifiers();
        ps.college_Name="Saraswati";
        System.out.println(ps.college_Name);

        //public instance variable is accessed from the another class
        PublicSpecifiers2 ps2=new PublicSpecifiers2();
        ps2.college_Name2="DAV";
        ps2.college_Name="Maharani";
        System.out.println(ps2.college_Name2);
        ps2.display();

    }
}
