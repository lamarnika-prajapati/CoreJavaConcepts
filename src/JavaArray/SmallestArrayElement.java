package JavaArray;

public class SmallestArrayElement {
    public static void main(String[] args) {
        int smallArray[]=new int[]{1,2,8,4,9,1,6};
        int min=smallArray[0];
        for(int i=1;i<smallArray.length;i++)
        {
            if(smallArray[i]<min)
            {
                min=smallArray[i];
            }
        }
        System.out.println("Smallest array lement: "+min);
    }
}
