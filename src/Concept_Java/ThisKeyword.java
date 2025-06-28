package Concept_Java;

public class ThisKeyword {
    String name;
    int eid;
    ThisKeyword()
    {
        System.out.println("This keyword");
    }
    ThisKeyword(int eid, String name)
    {
        this();  // this refers to current class constructor
        this.name=name; // this refers to current class instance variables
        this.eid=eid;// this refers to current class instance variables
    }
    void display()
    {
        System.out.println(eid);
        System.out.println(name);
    }
    void showing()
    {
        this.display();
        this.messaging(this);// this refers to current class instance method
    }
    void messaging(ThisKeyword tkd)
    {
        System.out.println("This refers to method passing object");
        System.out.println(name);
        System.out.println(eid);
    }

    public static void main(String[] args) {
        ThisKeyword tk =new ThisKeyword(101, "Guddu");
        tk.showing();
    }
}
