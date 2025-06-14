package Concept_Java;

public class ParentCovariant
{
    ParentCovariant display()
    {
        System.out.println("Parent class");
        return this;
    }
    void print()
    {

        System.out.println("Print Parent");
    }
}
class ChildCovariant1 extends ParentCovariant
{
    ParentCovariant display()
    {
        System.out.println("Child class 1");
        return this;
    }
    void print()
    {
        System.out.println("Print Child 1");
    }
    void child1Printing()
    {
        System.out.println("printing method of child 1");

    }
}
class ChildCovariant2 extends ParentCovariant
{
    ChildCovariant1 display()
    {
        System.out.println("Child class 2");
        return new ChildCovariant1();
    }
    void print()
    {
        System.out.println("Print Child 2");
    }
    void child2Printing()
    {
        System.out.println("printing method of child 2");

    }
}

class MainCovariant
{
    public static void main(String[] args) {
        ChildCovariant1 c1=new ChildCovariant1();
        System.out.println("upcating to call child class overridden method");
        c1.display().print(); //upcasting done from display method by returning child class
        // object to parent ref :- similar to: parent ref=new child obj;

        System.out.println();
        System.out.println("down-casting to call child class 1 self method");
        ChildCovariant1 cc= (ChildCovariant1) c1.display();//downcasting
        cc.child1Printing();

        System.out.println();
        System.out.println("upcasting to display child class overridden methods");
        ParentCovariant p1=new ChildCovariant2();
        p1.display(); //overridden method
        p1.print();//overridden method
       // p1.child2Printing(); we can call child class self method using upcasting,
        // we need to downcast parent ref to child ref.
        System.out.println();
        System.out.println("down-casting to call child class 2 self method");
        ChildCovariant2 cr= (ChildCovariant2) p1;
        cr.child2Printing();
        System.out.println();

        
        System.out.println(p1.display());
        ChildCovariant1 cc1= (ChildCovariant1) p1.display();
        cc1.child1Printing();
        System.out.println();

    }
}
