package JavaArray;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number=7,sum=0;
        int n1=0,n2=1;
        for (int i=0;i<number;i++)
        {
            System.out.println(n1);
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }

    }
}
