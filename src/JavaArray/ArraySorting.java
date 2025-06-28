package JavaArray;

public class ArraySorting {
    public static void main(String[] args) {

        //sorting elements
        int arraySorted[]=new int[]{8,3,7,5,3,9,2,4,1};
        int temp=0;
        for(int i=0;i<arraySorted.length;i++)
        {
            for(int j=i+1;j<arraySorted.length;j++)
            {
                if(arraySorted[j]<arraySorted[i])
                {
                    temp=arraySorted[i];
                    arraySorted[i]=arraySorted[j];
                    arraySorted[j]=temp;
                }
            }
        }
        System.out.println("Sorted Elements: ");
        for(int i=0;i<arraySorted.length;i++) {
            System.out.println(arraySorted[i]);
        }

    }
}
