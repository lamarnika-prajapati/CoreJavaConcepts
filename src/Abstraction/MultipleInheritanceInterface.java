package Abstraction;

public interface MultipleInheritanceInterface {
    void displayParent();
}
interface MultipleInheritanceInterface2 {
    void displayParent2();
}
class DerivedClass implements MultipleInheritanceInterface, MultipleInheritanceInterface2 {
    void displayDerived() {
        System.out.println("child class");
    }
    public void displayParent()
    {
        System.out.println("Parent first interface");
    }
    public void displayParent2()
    {
        System.out.println("Parent second interface");
    }
}
class MultipleMain {
    public static void main(String[] args) {
        DerivedClass dc=new DerivedClass();
        dc.displayDerived();
        dc.displayParent();
        dc.displayParent2();
    }
}
