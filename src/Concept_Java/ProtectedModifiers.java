package Concept_Java;
public class ProtectedModifiers {
    protected float int_rate;
    protected void display()
    {
        System.out.println(int_rate);
    }
}
class ChildProtected extends ProtectedModifiers {
    String name;
    public void display1()
    {
        System.out.println(name);
        System.out.println(int_rate);// protected variables is accessible inside child class
        display();
    }
}

class AccessProtectedModifiers
{
    public static void main(String[] args) {
        ProtectedModifiers obj=new ProtectedModifiers();
        obj.int_rate=5;
        System.out.println(obj.int_rate);
        obj.display();
        ChildProtected cp=new ChildProtected();
        cp.name="Guddu";
        cp.int_rate=10;  // protected variable is accessible inside same package
        cp.display1();
    }
}
