package Inheritance;
public class SingleLevelInheritance {
    String name;
    int age;
    void displaySuper() {
        System.out.println("Super Class "+ name);
        System.out.println("Super Class "+ age);
    }
}
class SubClass extends SingleLevelInheritance {
    String address;
    void displaySub(){
        System.out.println("Sub class "+address);
    }
}
class MainInheritanceClass {
    public static void main(String[] args) {
        SubClass sc=new SubClass();
        sc.address="makrana";
        sc.name="Rala";
        sc.age=34;
        sc.displaySub();
        sc.displaySuper();
    }
}
