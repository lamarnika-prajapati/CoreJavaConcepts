package JavaArray;

public class MergeArray {
    public static void main(String[] args) {
        int ar1[]={1,2,3,4,5};
        int ar2[]={2,6,7,8,9,10};
        int size=ar1.length+ar2.length;
        int ar3[]=new int[size];
        for(int i=0;i<ar1.length;i++)
        {
            ar3[i]=ar1[i];
        }
        int k=ar1.length;
        for(int j=0;j<ar2.length;j++)
        {
            ar3[k]=ar2[j];
            k++;
        }

        System.out.println("Merging two array");
        for(int j=0;j<ar3.length;j++) {
            System.out.println(ar3[j]);
        }

    }
}
