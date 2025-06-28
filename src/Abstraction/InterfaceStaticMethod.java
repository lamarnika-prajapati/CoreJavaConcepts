package Abstraction;

public interface InterfaceStaticMethod {
     String name = "College";
     static void staticMethod()
     {
         System.out.println("Parent static method "+name);
     }
     void show();
     default void print()
     {
         System.out.println("print interface");
     }

}
class InterfaceChildStaticMethod implements InterfaceStaticMethod
{
   String name = "School";
    public void show()
    {
       // System.out.println(InterfaceStaticMethod.super.name); not allowed to access interface static varaiable with super name
        System.out.println(InterfaceStaticMethod.name);
        System.out.println(name);
        InterfaceStaticMethod.staticMethod();
        InterfaceStaticMethod.super.print();
    }
    public void print()
    {
        System.out.println("Child print");
    }
    public static void staticMethod()  //it is not considered overridden method
    {
        System.out.println("Child static method "+InterfaceStaticMethod.name);
    }

}
class MainInterfaceStaticMethod
{
    public static void main(String[] args) {
        InterfaceStaticMethod is=new InterfaceChildStaticMethod();
        is.print();
        is.show();
        //is.staticMethod(); we can't call own method of child class with upcating.
        InterfaceStaticMethod.staticMethod();  // static method can be called with class name
        InterfaceChildStaticMethod.staticMethod();  // static method can be called with class name

    }
}
