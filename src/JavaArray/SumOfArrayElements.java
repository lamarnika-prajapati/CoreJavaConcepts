package JavaArray;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,20};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of array elements: "+sum);
    }
}
