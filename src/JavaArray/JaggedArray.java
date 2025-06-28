package JavaArray;

public class JaggedArray {
    public static void main(String[] args) {
        int jarray[][]=new int[3][]; //one way to declare and initialize jagged array;
        jarray[0]=new int[]{1,2};
        jarray[1]=new int[]{3,4,5,6};
        jarray[2]=new int[]{7,8,9};

        for(int i=0;i<jarray.length;i++)
        {
            for(int j=0;j<jarray[i].length;j++)
            {
                System.out.print(jarray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int [][]jarray1={{11,12},{13,14,15},{16}}; //2nd way to declare and initialize jagged array;
        for(int i=0;i<jarray1.length;i++)
        {
            for(int j=0;j<jarray1[i].length;j++)
            {
                System.out.print(jarray1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] jarray2=new int[][]{{111,222},{333,444,555}}; //3rd way to declare and initialize jagged array;
        for(int i=0;i<jarray2.length;i++)
        {
            for(int j=0;j<jarray2[i].length;j++)
            {
                System.out.print(jarray2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int jarray3[][]=new int[2][];//4th way to declare and initialize jagged array;
        jarray3[0]=new int[3];
        jarray3[1]=new int[2];
        jarray3[0][0]=1000;
        jarray3[0][1]=2000;
        jarray3[0][2]=3000;
        jarray3[1][0]=4000;
        jarray3[1][1]=5000;
        for(int i=0;i<jarray3.length;i++)
        {
            for(int j=0;j<jarray3[i].length;j++)
            {
                System.out.print(jarray3[i][j]+" ");
            }
            System.out.println();
        }


    }

}
