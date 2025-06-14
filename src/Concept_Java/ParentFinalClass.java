package Concept_Java;

public class ParentFinalClass {
    final int zipcode=6;
    final String city; // a blank final variable means not initialized while declaring it

    static final int pincode=29320;
    static final String state; // a static blank final variable

    static{state="Rajasthan";} //a static blank final variable can be initialized via a static block

    public ParentFinalClass()
    {
        city="Delhi";  //a blank final variable can only be initialized via constructor
    }

    final void display()
    {
        //final variable can't be changed once it is initialized.
        //zipcode=500;
        //pincode=8767;
        System.out.println(zipcode);
        System.out.println(city);
        System.out.println(state);
        System.out.println(pincode);

    }
}
final class ChildFinalClass extends ParentFinalClass
 {

//void display() a final method can not be overridden in the sub class
     void displaychild()
{
    //final variable can't be changed once it is initialized.
    //zipcode=1000;
    //city="Gurugram";
    System.out.println(zipcode);
    System.out.println(city);
    System.out.println(state);
    System.out.println(pincode);
}

}
class MainFinalClass // extends ChildFinalClass  , a final class can not be inherited
{
    public static void main(String[] args) {
        ChildFinalClass cf=new ChildFinalClass();
        cf.display();
        cf.displaychild();

    }
}