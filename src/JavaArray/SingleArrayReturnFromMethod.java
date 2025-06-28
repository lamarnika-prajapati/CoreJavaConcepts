package JavaArray;

public class SingleArrayReturnFromMethod {
    int a1[]={1,2,3,4};
    int a2[];
    public int[] ArrayReturnMethod1()
    {
        return a1; // return same memory location of a1;
    }
    public int[] ArrayReturnMethod2()
    {
        a2 = new int[a1.length];
        for(int i=0;i<a1.length;i++)
        {
            a2[i]=a1[i];
        }
        return a1; // return same memory location of a2;
    }

    public static void main(String[] args) {
        SingleArrayReturnFromMethod so=new SingleArrayReturnFromMethod();
        int arr[]=so.ArrayReturnMethod1();
        for(int i:arr)
        {
            System.out.println("arr: "+i);
        }
        arr[2]=8;
        for(int i:so.a1)
        {
            System.out.println("a2: "+i);
        }
        int ad[]=new int[]{0,1,2,3,4};
        for(int i:ad)
        {
            System.out.println(i);
        }
        int arr1[]=so.ArrayReturnMethod2();
        for(int i:arr1)
        {
            System.out.println(i);
        }
        arr1[0]=100;
        for(int i:arr1)
        {
            System.out.println(i);
        }
        for(int i:so.a1)
        {
            System.out.println(i);
        }
        for(int i:so.a2)
        {
            System.out.println(i);
        }

    }
}
