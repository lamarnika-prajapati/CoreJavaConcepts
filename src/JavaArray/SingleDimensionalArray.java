package JavaArray;

public class SingleDimensionalArray {
    int arr[];
    int arr1[]=new int[3];
    public void arrayInitialization()
    {
        arr=new int[3]; //to initialize array elements, first we need instantiated(define size)
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        for(int i:arr)
        {
            System.out.println(i);
        }

        //to initialize array elements, first we need instantiated(define size)
        // to array like defined size in line 5.
        arr1[0]=4;
        arr1[1]=5;
        arr1[2]=6;
        for(int i:arr1)
        {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        SingleDimensionalArray sa = new SingleDimensionalArray();
        sa.arrayInitialization();

    }
}
