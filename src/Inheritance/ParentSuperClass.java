package Inheritance;

public class ParentSuperClass {
    String address="Makrana";
    int id=101;

}
class ChildSuperClass extends ParentSuperClass{

    String address="Luhar Pura";

    void print()
    {
        System.out.println("Parent Id, Parent address and Child address: "+id+" "+super.address+" "+address);
    }
}
class MainSuperClass{
    public static void main(String[] args) {
        ChildSuperClass obj=new ChildSuperClass();
        obj.print();
    }
}