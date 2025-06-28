package Constructor;
public class CopyConstructor {
    int a;
    String b;
    CopyConstructor(int a, String b)
    {
        this.a=a;
        this.b=b;
    }
    CopyConstructor(CopyConstructor cc) //copy constructor copy the value of one object to another
    {
        a=cc.a;
        b=cc.b;
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        CopyConstructor cc = new CopyConstructor(5,"Lamarnika");
        cc.display();
        CopyConstructor cc1= new CopyConstructor(cc); //calling copy constructor
        cc1.display();
    }
}
