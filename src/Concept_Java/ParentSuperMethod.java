package Concept_Java;

public class ParentSuperMethod {
    void print()
    {
        System.out.println("Lamarnika");
    }
    void show()
    {
        System.out.println("Gudiya");
    }
}
class ChildSuperMethod extends ParentSuperMethod{
    void print()
    {
        super.print();
        show();
        System.out.println("Prajapati");
    }
}
class MainSuperMethod
{
    public static void main(String[] args) {
        ChildSuperMethod cs=new ChildSuperMethod();
        cs.print();
        cs.show();;
    }
}
