package Concept_Java;

public class ParameterizedConstructor {
    String name;
    String job;
    ParameterizedConstructor(String st, String jb) //parameterized constructor is used to initialize
    // different values to objects
    {
        name=st;
        job=jb;
    }
     public void display()
    {
        System.out.println(name);
        System.out.println(job);
    }
    public static void main(String[] args) {
        ParameterizedConstructor pc=new ParameterizedConstructor("Lamarnika", "Engineer");
        System.out.println(pc.name);
        System.out.println(pc.job);
        pc.display();
    }
}
