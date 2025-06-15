package Operators;

public class Unary_Operator {
    int n1;
    int n2;
    boolean b;

    public Unary_Operator(int n1, int n2, boolean b) {
        this.n1 = n1;
        this.n2 = n2;
        this.b = b;
    }
    public void operation_method() {
        System.out.println("Pre Increment operator: " + ++n1);
        System.out.println("Post Increment operator: " + n1++);
        System.out.println("Pre Decrement operator: " + --n1);
        System.out.println("Post Decrement operator: " + n1--);
        System.out.println("Positive operator: " + +n2);
        System.out.println("Negative operator: " + -n2);
        System.out.println("Invert/logical Not operator: " + !b);
        System.out.println("Bitwise complement operator: " + ~n1);
        System.out.println("Bitwise complement operator: " + n1);
    }
    public static void main(String[] args) {
        Unary_Operator uo = new Unary_Operator(5, 8, true);
        uo.operation_method();
    }

}
