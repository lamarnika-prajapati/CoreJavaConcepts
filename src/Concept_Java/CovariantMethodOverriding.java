package Concept_Java;
public class CovariantMethodOverriding {
    CovariantMethodOverriding show() {
        System.out.println("Parent class object");
        return this;
    }
}
class ChildCovariantClass extends CovariantMethodOverriding {
    void showing() {
        System.out.println("child class of CovariantMethodOverriding");
    }
}
class ChildCovariant extends CovariantMethodOverriding {
    ChildCovariantClass show() //Covariant return type means that the return type of an overridden method
    // is allowed to be a subtype of the return type declared in the original (superclass) method.
    {
        System.out.println("Child class object");
        return new ChildCovariantClass();
    }
}
class CovariantMain {
    public static void main(String[] args) {
        CovariantMethodOverriding co=new CovariantMethodOverriding();
        co.show();
        ChildCovariant cc=new ChildCovariant();
        cc.show().showing();
    }
}
