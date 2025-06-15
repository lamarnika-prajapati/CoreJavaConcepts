package Java_Variables;

public class Static_Variable {
    static String str="Lamarnika"; //declaration of static variable inside the class but outside the methods,constructors and blocks
    String str2;
    public Static_Variable(String s)
    {
        str2=s;
        str=s; //use of static method inside the constructor
    }

    public void getter()
    {
        System.out.println(str);
        System.out.println(str2);
        str="Rajat";  //use of static method inside the instance method
        System.out.println(str);
    }

    public static void main(String[] args) {
        System.out.println(str); ////use of static method inside the static method
        Static_Variable sv=new Static_Variable("Gudiya");
        System.out.println(sv.str2);
        sv.getter();

    }
}
