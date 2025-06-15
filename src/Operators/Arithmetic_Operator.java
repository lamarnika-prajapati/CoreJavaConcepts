package Operators;

public class Arithmetic_Operator {
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        int sum;
        int mul;
        int div;
        int sub;
        int rem;
        sum=num1+num2;
        mul=num1*num2;
        sub=num1-num2;
        div=num2/num1;
        rem=num2%num1;
        System.out.println("Addition of two numbers: "+ sum);
        System.out.println("Subtraction of two numbers: "+ sub);
        System.out.println("Multiplication of two numbers: "+ mul);
        System.out.println("division of two numbers: "+ div);
        System.out.println("reminder of two numbers: "+ rem);
    }
}
