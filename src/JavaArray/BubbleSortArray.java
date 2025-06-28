package JavaArray;

import java.util.Arrays;

public class BubbleSortArray {
    public static void main(String[] args) {
        int bubbleArray[]=new int[]{6,2,8,3,5,9,1};
        int n=bubbleArray.length;
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(bubbleArray[j]>bubbleArray[j+1])
                {
                    temp=bubbleArray[j];
                    bubbleArray[j]=bubbleArray[j+1];
                    bubbleArray[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(bubbleArray));
    }
}
