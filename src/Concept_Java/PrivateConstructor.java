package Concept_Java;

public class PrivateConstructor {
    int a;
    static PrivateConstructor pp;
    private PrivateConstructor(int a)
    {
        this.a=a;
        System.out.println("Private constructor");
    }
    void display()
    {
        System.out.println(a);
    }
    static PrivateConstructor getInstance()
    {

        return new PrivateConstructor(10);

    }
    public static void main(String[] args) {

        PrivateConstructor pc = new PrivateConstructor(20);
        pc.display();
    }
}
class MainPrivateConstructor
{
    public static void main(String[] args) {
        PrivateConstructor ob1= PrivateConstructor.getInstance();
        PrivateConstructor ob2 = PrivateConstructor.getInstance();
        System.out.println(ob1);
        System.out.println(ob2);

       //PrivateConstructor pc1 = new PrivateConstructor(30);

        //pc1.display();
    }
}
