package Inheritance;
public class MultiLevelInheritance {
    int a;
    void displaySuper()
    {
        System.out.println("I am a super class");
    }
    void show()
    {
        System.out.println("Parent show");
    }
}

class SubInheritance extends MultiLevelInheritance {
    void displaySub1()
    {
        System.out.println("I am a sub1 class");
    }
    void show()
    {
        System.out.println("Child 1 show");
    }
}
class Sub2Inheritance extends SubInheritance
{
    void displaySub2()
    {
        System.out.println("I am a sub2 class");
    }

}
class MainInheritance
{
    public static void main(String[] args) {
        Sub2Inheritance sb2=new Sub2Inheritance();
        sb2.displaySuper();
        sb2.displaySub1();
        sb2.displaySub2();
        MultiLevelInheritance mo=new Sub2Inheritance();
        mo.show();

    }
}
