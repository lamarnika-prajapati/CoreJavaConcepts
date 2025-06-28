package JavaArray;

public class LargestArrayElement {
    public static void main(String[] args) {
        int largarray[]=new int[]{8,10,8,6,2,10};
        int max=largarray[0];
        for(int i=1;i<largarray.length;i++)
        {
            if(largarray[i]>max)
            {
                max=largarray[i];
            }
        }
        System.out.println("Largest element: "+max);
    }
}
