package Constructor;
public class ConstructorOverloading {
int a, b;
float c;
ConstructorOverloading(int a, int b) {
    this.a=a;
    this.b=b;
}
ConstructorOverloading(int a, int b, int c) {//constructor overloading
    this(a,b);
    this.c=c;
}
public void display1() {
    System.out.println(a);
    System.out.println(b);
}
public void display() {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
    public static void main(String[] args) {
        ConstructorOverloading co=new ConstructorOverloading(5,10,20);
        co.display();
        ConstructorOverloading co1=new ConstructorOverloading(4,5);
        co1.display1();
    }
}
