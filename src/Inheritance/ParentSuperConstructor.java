package Inheritance;

public class ParentSuperConstructor {
    String name;
    String gender;
    public ParentSuperConstructor()
    {
        System.out.println("Parent Constructor");
    }
    public ParentSuperConstructor(String nm, String gd)
    {
        name=nm;
        gender=gd;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(gender);
    }

}
class ChildSuperConstructor extends ParentSuperConstructor{
    int id;
    int salary;
    public ChildSuperConstructor()
    {
        //in the first statement, compiler inject super() by default to invoke parent class default
        // constructor
        System.out.println("Child Constructor");
    }
    public ChildSuperConstructor(String name, String gender, int id, int sal)
    {
        super(name,gender); //if do not call parent constructor explicitly, then compiler invoke parent
        // class default constructor.
        this.id=id;
        salary=sal;
    }

    void display()
    {
        super.display();
        System.out.println(id);
        System.out.println(salary);

    }
}
class MainSuperConstructor {
    public static void main(String[] args) {
        ChildSuperConstructor cc=new ChildSuperConstructor();
        ChildSuperConstructor c1=new ChildSuperConstructor("Lamarnika", "Female", 101, 50000);
        c1.display();
    }
}
