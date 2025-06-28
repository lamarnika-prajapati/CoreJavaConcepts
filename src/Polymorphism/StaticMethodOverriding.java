package Polymorphism;

public class StaticMethodOverriding {
    static void display()
    {
        System.out.println("Parent class");
    }
}
class ChildStaticMethodOverriding extends StaticMethodOverriding
{
    static void display()  // here it is not implementing method overriding b/c static method belongs to a class, not to object
    {
        System.out.println("Child Class");
    }
}
class StaticMainOverriding
{
    public static void main(String[] args) {
        ChildStaticMethodOverriding so=new ChildStaticMethodOverriding();
        so.display(); //output:- Child class
        StaticMethodOverriding so1=new StaticMethodOverriding();
        so1.display(); //output:- Parent class
        StaticMethodOverriding so2=new ChildStaticMethodOverriding(); // static metgod runs based on class reference variable.
        so2.display();  //output:- Parent class

    }
}
