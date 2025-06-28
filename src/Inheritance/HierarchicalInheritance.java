package Inheritance;
public class HierarchicalInheritance {
    void displayParent() {
        System.out.println("Parent class");
    }
}
class FirstDerivedClass extends HierarchicalInheritance {
    void firstDisplayDerived() {
        System.out.println("First child class");
    }
}
class SecondDerivedClass extends HierarchicalInheritance {
    void secondDisplayDerived() {
        System.out.println("Second child class");
    }
}
class HierarchicalMain {
    public static void main(String[] args) {
        HierarchicalInheritance hi=new HierarchicalInheritance();
        hi.displayParent();
        FirstDerivedClass fd=new FirstDerivedClass();
        fd.firstDisplayDerived();
        fd.displayParent();
        SecondDerivedClass sd=new SecondDerivedClass();
        sd.secondDisplayDerived();
        sd.displayParent();
    }
}