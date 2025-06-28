package JavaArray;

import java.util.Scanner;

public class JavaSingleDimensionalArray {
    public static void main(String[] args) {
        int arr1[]=new int[3];
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        System.out.println(arr1);
        for(int i:arr1)
        {
            System.out.println(i);
        }

        int arr2[]={40,50,60};
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }

        int[] arr3=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr3.length;i++)
        {
            arr3[i]=sc.nextInt();
        }
        for(int i:arr3)
        {
            System.out.println(i);
        }

    }
}
