package Concept_Java;

public abstract class AbstractClassExample {
    abstract void display();
    void print(){
        System.out.println("Parent print");
    }
    public AbstractClassExample()
    {
        System.out.println("Parent constructor");
    }

}
class AbstractChildExample extends AbstractClassExample
{
    void display()
    {
        System.out.println("Child display");
    }
    public AbstractChildExample()
    {
        System.out.println("Child constructor");
    }
    void print()
    {
        System.out.println("Child show");
    }

}
class AbstractChild2Example extends AbstractChildExample
{
    void display()
    {
        System.out.println("Child2 display");
    }
    AbstractChild2Example()
    {
        System.out.println("Child2 constructor");
    }
}class AbstractChild3Example extends AbstractClassExample
{
    void display()
    {
        System.out.println("Child3 display");
    }
    void show()
    {
        super.print();
        System.out.println("Child3 show");
    }

}
class AbstractMainExample
{
    public static void main(String[] args) {
        AbstractClassExample obj=new AbstractChild3Example();
        obj.print();
        obj.display();
        AbstractChild3Example ac=(AbstractChild3Example) obj;
        ac.show();
        AbstractClassExample obj1=new AbstractChild2Example();
        obj1.print();
        obj1.display();

    }
}