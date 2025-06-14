package Concept_Java;

public class DefaultConstructor {
    int a;
    int b;
    void calculate()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        //if a default constructor is not created to initialize the objects, then java compiler
        // creates a default constructor automatically and assign default values based on data type values
        DefaultConstructor dc=new DefaultConstructor();
        dc.calculate();
    }
}
