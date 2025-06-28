package JavaArray;
import java.util.Arrays;
public class SelectionSortArray {
    public static void main(String[] args) {
        int selectionSort[]=new int[]{5,2,8,3,9,1,6};
        int min;
        int temp;
        for(int i=0;i<selectionSort.length-1;i++)
        {
            min=i;
            for(int j=i+1;j<selectionSort.length;j++)
            {
                if(selectionSort[j]<selectionSort[min])
                {
                    min=j;
                }
            }
            temp=selectionSort[i];
            selectionSort[i]=selectionSort[min];
            selectionSort[min]=temp;
        }
        System.out.println(Arrays.toString(selectionSort));
    }
}
