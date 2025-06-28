package Polymorphism;

public class FinalMethodOverriding {
    final void show()
    {
        System.out.println("Parent class");
    }
}
class ChildFinalMethodOverriding extends FinalMethodOverriding
{
    /*void show()  // unable to override method to final method
    {
        System.out.println("Child class ");
    }*/

    void show(String st)  //It is not a override method
    {
        System.out.println("Child class " + st);
    }
}
class FinalMainMethod
{
    public static void main(String[] args) {
        ChildFinalMethodOverriding co=new ChildFinalMethodOverriding();
        co.show("Lamarnika");  //call child method
        co.show(); // call parent method
    }
}
