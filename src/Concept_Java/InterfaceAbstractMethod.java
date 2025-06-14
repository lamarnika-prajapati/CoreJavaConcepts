package Concept_Java;

public interface InterfaceAbstractMethod {
    void print();  //It is a abstract method as compiler invoke public abstract method by default
    public abstract void show();
}
class InterfaceChildClass implements InterfaceAbstractMethod
{
    public void print()
    {
        System.out.println("Print child");
    }
    public void show()
    {
        System.out.println("child show");
    }
}
class InterfaceMain
{
    public static void main(String[] args) {
        InterfaceAbstractMethod ip=new InterfaceChildClass();
        ip.print();
        ip.show();

    }
}
