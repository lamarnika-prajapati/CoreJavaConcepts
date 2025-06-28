package JavaArray;

import java.util.Arrays;

public class InsertionSortArray {
    public static void main(String[] args) {
        int insertionSort[] = new int[]{3,8,2,10,5,12,4};
        int temp;
        for(int i=1;i<insertionSort.length;i++)
        {
            temp=insertionSort[i];
            int j=i-1;
            while (j>=0&&insertionSort[j]>temp)
            {
                insertionSort[j+1]=insertionSort[j];
                j--;
            }
            insertionSort[j+1]=temp;

        }
        System.out.println(Arrays.toString(insertionSort));
    }
}
