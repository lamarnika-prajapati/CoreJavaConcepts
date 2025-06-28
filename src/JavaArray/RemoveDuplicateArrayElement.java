package JavaArray;

public class RemoveDuplicateArrayElement {
    public static void main(String[] args) {

        //sorting elements
        int arrayWithDuplicates[]=new int[]{1,3,7,5,3,9,2,4,1};
        //remove duplicate elements from array
        int arrayWithoutDuplicate[]=new int[arrayWithDuplicates.length]; //1,3,7,5,3,9,2,4,1
        arrayWithoutDuplicate[0]=arrayWithDuplicates[0];
        int k=1;
        for(int i=1;i<arrayWithDuplicates.length;i++)
        {
            boolean isValueAlreadyPresent=false;
            for(int j=0;j<i;j++)
            {
                if(arrayWithDuplicates[i]==arrayWithoutDuplicate[j])
                {
                    isValueAlreadyPresent=true;
                    break;
                }
            }
            if (!isValueAlreadyPresent) {
                arrayWithoutDuplicate[k]=arrayWithDuplicates[i];
                k++;
            }
        }
        for(int i=0;i<k;i++) {
            System.out.println(arrayWithoutDuplicate[i]);
        }

    }
}
