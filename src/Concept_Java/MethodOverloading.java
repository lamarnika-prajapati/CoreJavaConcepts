package Concept_Java;
public class MethodOverloading {
    int n1, n2, n3;
    public void operation(int n1, int n2, int n3) {
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
        System.out.println(this.n1);
        System.out.println(this.n2);
        System.out.println(this.n3);
    }
    protected void operation(int n1, int n2)  // by changing the number of arguments
    {
        System.out.println(n1);
        System.out.println(n2);}
     void operation(double n1, double n2, double n3) //by changing the type of arguments
    {
        double t;
        t=n1+n2+n3;
        System.out.println(t);}
}
class MainOperation {
    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.operation(2,5,8);
        mo.operation(3,4);
        mo.operation(6.6,7.7,8.8);
    }
}
