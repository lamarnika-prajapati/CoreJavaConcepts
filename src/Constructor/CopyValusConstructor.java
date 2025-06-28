package Constructor;

public class CopyValusConstructor {
    int marks;
    String name;
    CopyValusConstructor(int marks, String name)
    {
        this.marks=marks;
        this.name=name;
    }
    CopyValusConstructor()
    {

    }
    void display() {
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        CopyValusConstructor cv=new CopyValusConstructor(80,"Lamarnika");
        CopyValusConstructor cv1 = new CopyValusConstructor();
        cv.display();
        cv1.name=cv.name;
        cv1.marks=cv.marks;
        cv1.display();

    }
}
