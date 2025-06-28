package JavaArray;

public class SecondLargeElement {
    public static void main(String[] args) {
        int larray[]={1,9,8,4,8,1,7};
        int max1st=Integer.MIN_VALUE;
        int max2nd=Integer.MIN_VALUE;
        for(int i=1;i<larray.length;i++)
        {
            if(larray[i]>max1st)
            {
                max2nd=max1st;
                max1st=larray[i];

            }
            else if(larray[i]>max2nd && larray[i]!=max1st)
            {
                max2nd=larray[i];
            }
        }

        System.out.println("First largest element of single array: "+ max1st);
        System.out.println("Second largest element of single array: "+ max2nd);


    }
}
