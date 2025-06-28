package JavaArray;

public class MultiplicationArray {
    public static void main(String[] args) {
        int a[][] = new int[][]{{1, 1, 1}, {2, 2, 2},{3, 3, 3}};
        int b[][] = new int[][]{{1, 1, 1}, {2, 2, 2},{3, 3, 3}};
        int m[][]= new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                m[i][j]=a[i][j]+b[i][j];
            }
        }
    }
}
