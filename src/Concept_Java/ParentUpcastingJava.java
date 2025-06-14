package Concept_Java;
public class ParentUpcastingJava {
    void print()
    {
        System.out.println("Print to Parent class");
    }
    void show()
    {
        System.out.println("Show to Parent class");
    }
}
class ChildUpcastingJava extends ParentUpcastingJava {
    void print()
    {
        System.out.println("Print to Child class");
    }
    void show(int i) //not overridden method
    {
        System.out.println(i);
    }
}
class MainUpcasting {
    public static void main(String[] args) {
        ParentUpcastingJava pu=new ChildUpcastingJava();
        pu.print(); //call to child class method
        pu.show();  //call to parent class method

    }
}
