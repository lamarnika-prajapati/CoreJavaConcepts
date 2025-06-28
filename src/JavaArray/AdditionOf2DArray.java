package JavaArray;

public class AdditionOf2DArray {
    public static void main(String[] args) {
        int a[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int b[][] = new int[][]{{7,8,9},{2,4,6}};
        int c[][]= new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

}
