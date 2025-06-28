package JavaArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthSmallestElement {
    public static void main(String[] args) {
        int arr[]=new int[]{5,2,8,4,6,1,9};
        System.out.println("Enter the kth smallest element");
        Scanner sc=new Scanner(System.in);
        int ind=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(ind-1));

    }
}
