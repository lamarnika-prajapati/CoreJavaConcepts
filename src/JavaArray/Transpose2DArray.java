package JavaArray;

import java.util.Arrays;

public class Transpose2DArray {
    public static void main(String[] args) {
        int arrayForTranspose[][]=new int[][]{{1,3,5},{2,4,6}};
        int arrayTranspose[][]=new int[arrayForTranspose[0].length][arrayForTranspose.length];
        for(int i=0;i<arrayForTranspose.length;i++)
        {
            for(int j=0;j<arrayForTranspose[i].length;j++)
            {
                System.out.print(arrayForTranspose[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<arrayForTranspose.length;i++)
        {
            for(int j=0;j<arrayForTranspose[i].length;j++)
            {
                arrayTranspose[j][i]=arrayForTranspose[i][j];
            }
        }
        for(int i=0;i<arrayTranspose.length;i++)
        {
            for(int j=0;j<arrayTranspose[i].length;j++)
            {
                System.out.print(arrayTranspose[i][j]);
            }
            System.out.println();
        }


    }
}
