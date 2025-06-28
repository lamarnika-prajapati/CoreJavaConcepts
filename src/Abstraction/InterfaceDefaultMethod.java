package Abstraction;

public interface InterfaceDefaultMethod {
    int code=100;
    void abstractPrint();
    default void defaultAbstractMethod()
    {
        //code=200; not allowed
        System.out.println(code);
    }
}
class ChildInterfaceDefaultMethod implements InterfaceDefaultMethod
{
    public void abstractPrint()
    {
        System.out.println(code);
    }
    public void defaultAbstractMethod()
    {
        InterfaceDefaultMethod.super.defaultAbstractMethod();  // it is used to call the overridden default
        // method of interface
        System.out.println(code);
        System.out.println("default method of child");
    }
}
class MainInterfaceDefaultMethod
{
    public static void main(String[] args) {
        InterfaceDefaultMethod o=new ChildInterfaceDefaultMethod();
        o.abstractPrint();
        o.defaultAbstractMethod();
    }
}
