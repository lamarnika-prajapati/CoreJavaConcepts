package Concept_Java;

public abstract class AbstractParentClass {
    int intrate=10; //abstract class instance variable
    public AbstractParentClass() //abstract class constructor
    {
        System.out.println(intrate);
        System.out.println("constructor parent abstract class");
    }
    void display() //concrete method
    {
        System.out.println(intrate);
        System.out.println("display parent concrete  method");
    }
    abstract int show();//abstract method

}
class AbstractChildClass extends AbstractParentClass {
    void display() //overridden method
    {
        super.display();
        intrate=20;
        System.out.println(intrate);
        System.out.println("display child concrete  method");
    }
    int show() //implementation of abstract method of abstract class
    {
        return intrate;
    }

}
class AbstracMainClass {
    public static void main(String[] args) {
      // AbstractParentClass ab=new AbstractParentClass(); a abstract class cannot be instantiated
        AbstractParentClass ab=new AbstractChildClass();
        ab.display();
        ab.intrate=40;
        System.out.println(ab.show());
    }
}
