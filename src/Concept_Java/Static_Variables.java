package Concept_Java;
public class Static_Variables {
    static int rate=10;
    int empid;
    String name;
    float salary;
    Static_Variables(int eid, String nm, float sal)
    {
        empid=eid;
        name=nm;
        salary=sal;
    }
    public void display()
    {
        System.out.println(empid);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(rate);  //Static variables & methods can be accessed directly
        // inside non-static context without using object.
    }
    public void display1()
    {
        display(); //Non-static variables and methods can be accessed directly inside non-static
        // context without using object.
    }
    static void rateUpdate(int r)
    {
        rate=r; //Static variables and methods can be accessed directly inside static context
        // without using object.
    }
    public static void main(String[] args) {
        Static_Variables sv=new Static_Variables(1, "Guddu", 10000);
        sv.display();
       // sv.rateUpdate(12); static method can't be accessed inside static context using object
       // sv.rate=20; static variables can't be accessed inside static context using object
        rateUpdate(20); // static method can be accessed directly inside static context
        sv.display();
        rate=30; // static variable can be accessed directly inside static context
        sv.display();
        Static_Variables sv1=new Static_Variables(2, "Rajat", 50000);
        sv1.display();
        rateUpdate(30);
        sv1.display();

    }


}
