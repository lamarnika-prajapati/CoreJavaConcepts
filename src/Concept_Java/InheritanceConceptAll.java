package Concept_Java;

class Super_Class {
    void display() {
        System.out.println("Super class");
    }

    public Super_Class() {
        System.out.println("Super_Class constructor");
    }
}

class Sub_Class1 extends Super_Class {
    public Sub_Class1(int a, int b) {
        super();
        System.out.println("Hello");
        super.display();
    }

    public Sub_Class1(int a) {
        super();
    }

    public Sub_Class1() {
        System.out.println("sub class constructor");
    }

    void display() {
        super.display();
        System.out.println("Sub class");
    }
}

class Sub_Class2 extends Sub_Class1 {
    void display() {
        System.out.println("Sub class 2");
    }

    public Sub_Class2() {
        System.out.println("Sub_Class2 constructor");
    }
}

public class InheritanceConceptAll {
    public static void main(String[] args) {
        Sub_Class1 obj = new Sub_Class1(1);
        obj.display();

//        Super_Class obj1=new Super_Class();
//        obj1.display();
//
//        Sub_Class2 obj2=new Sub_Class2();
//        obj2.display();
    }
}
