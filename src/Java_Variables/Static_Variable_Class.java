package Java_Variables;

public class Static_Variable_Class {
    static String str="Lamarnika"; //declaration of static variable inside the class but outside the methods,constructors and blocks
    String str2; //instance variable
    public Static_Variable_Class(String s)
    {
        str2=s;
        str=s; //use of static method inside the constructor
    }

}
class Extension_Class
{
    public static void main(String[] args) {
        Static_Variable_Class cl=new Static_Variable_Class("Rajat");
        System.out.println(cl.str2);
        System.out.println(Static_Variable_Class.str);
    }
}
