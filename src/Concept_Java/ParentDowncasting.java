package Concept_Java;

public class ParentDowncasting
{
    void print()
    {
        System.out.println("Print to Parent class");
    }
    void show()
    {
        System.out.println("Show to Parent class");
    }
}
class ChildDowncasting extends ParentDowncasting
{
    void print()
    {
        System.out.println("Print to Child class");
    }
    void show(int i) //not overridden method
    {
        System.out.println(i);
    }
}
class MainDowncasting {
    public static void main(String[] args) {
        ParentDowncasting pu=new ChildDowncasting();
        pu.print(); //call to child class method
        pu.show(); // call t parent class method
       // pu.show(7);  /can't call to child class normal method
        System.out.println();
        System.out.println("Downcasting");
        ChildDowncasting cd= (ChildDowncasting) pu;
        cd.print();
        cd.show();
        cd.show(7);
    }
}
