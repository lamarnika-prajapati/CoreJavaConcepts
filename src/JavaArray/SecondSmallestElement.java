package JavaArray;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int sarray[]=new int[]{1,2,1,6,4,3};
        int min=sarray[0]; //1,
        int min2=Integer.MAX_VALUE; //1
        for(int i=1;i<sarray.length;i++)
        {
            if(sarray[i]<min)
            {
                min2=min;
                min=sarray[i];
            }
            else if(sarray[i]<min2 && sarray[i]!=min)
            {
                min2=sarray[i];
            }
        }
        System.out.println("First smallest value: "+min);
        System.out.println("Second smallest value: "+min2);


    }
}
