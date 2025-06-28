package JavaArray;

public class SingleArrayPassToMethod {
    int arr[];
    int arr1[];
    public void setArray(int ar[])
    {
        arr=ar; // if we assign a array variable to another variable directly then both will refer to
        // the same memory location. if we make any changes in one of array it will affect to
        // another variable.

        for(int i:arr)
        {
            System.out.println(i);
        }
        arr[1]=20; //making changes
        for(int i:ar)
        {
            System.out.println(i); // it will print ar[1]=20
        }

        arr1=new int[ar.length]; //create a new instance.
        for(int i=0;i<ar.length;i++) //manually initializing elements from one to another array
        {
            arr1[i]=arr[i];
        }
        arr1[1]=40;
        for(int i:arr1)
        {
            System.out.println(i); // it will print ar[1]=20
        }
        for(int i:ar)
        {
            System.out.println(i); // it will print ar[1]=20
        }

    }

    public static void main(String[] args) {
        SingleArrayPassToMethod sa=new SingleArrayPassToMethod();
        int arr[]={1,2,3};
        sa.setArray(arr); //pass array to the method
        //sa.setArray(new int[]{4,5,6});// pass Anonymous Array to the method
    }
}
