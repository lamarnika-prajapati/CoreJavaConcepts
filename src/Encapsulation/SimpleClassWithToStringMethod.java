package Encapsulation;

public class SimpleClassWithToStringMethod {
    int id;
    String name;
    public SimpleClassWithToStringMethod(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public void print()
    {
        System.out.println("Id and Name: "+id+" "+name);
    }
    public String toString()
    {
        return(id+" "+name);
    }
    public static void main(String[] args) {
        SimpleClassWithToStringMethod obj=new SimpleClassWithToStringMethod(101,"lara");
        obj.print();
        System.out.println(obj); // complier call toString mrthod
    }
}
