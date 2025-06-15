package Operators;

public class Logical_Operator {
    public static void main(String[] args) {
        int a=60;
        int b=80;
        int c=40;
        boolean b1 =false;
        //&& operator
        if(a>b && a>c)
        {
            System.out.println("Maximum value: "+a);
        }
        else if (b>c && b>a)
        {
            System.out.println("Maximum value: "+b);
        }
        else
            System.out.println("Maximum value: "+c);
        //|| operator
        if(a==50 || b==50 || c==50)
        {
            System.out.println("Matched");
        }
        else
            System.out.println("Not Matched");
        //! Logical Not operator
        if(!b1)
        {
            System.out.println(b1);
        }
    }

}
