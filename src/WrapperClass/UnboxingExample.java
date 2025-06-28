package WrapperClass;

public class UnboxingExample {
    public static void main(String[] args) {
        Integer v1=new Integer(500);
        int v2=v1; //unboxing
        int v3=v1.intValue();//manually conversion
        System.out.println(v2 +" "+ v3);

        Short s1=10;
        short s2=s1;
        short s3=s1.shortValue();
        System.out.println(s2 +" "+s3);

        Boolean b=false;
        boolean b1=b;
        System.out.println(b1);
        boolean b2=b.booleanValue();
        System.out.println(b2);
    }
}
