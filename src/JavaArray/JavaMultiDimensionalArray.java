package JavaArray;

public class JavaMultiDimensionalArray {
    int ma[][];
    int ma1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] ma2 = new int[][]{{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};

    public int[][] ArrayTraverse(int ma3[][]) // passing and returning multidimensional array
    {
        for (int i = 0; i < ma1.length; i++) {
            for (int j = 0; j < ma1[i].length; j++) {
                System.out.print(ma1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < ma2.length; i++) {
            for (int j = 0; j < ma2[i].length; j++) {
                System.out.print(ma2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        ma=new int[ma3.length][ma3[0].length];

        for (int i = 0; i < ma3.length; i++) {
            for (int j = 0; j < ma3[i].length; j++) {
                ma[i][j]=ma3[i][j];
                System.out.print(ma[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        ma[1][2]=1000;
        return ma;
    }
    public static void main(String[] args) {
        int ma4[][]={{111,222,333},{444,555,666}};
        JavaMultiDimensionalArray mo=new JavaMultiDimensionalArray();
        int obj[][]= mo.ArrayTraverse(ma4);
        for (int i = 0; i < ma4.length; i++) {
            for (int j = 0; j < ma4[i].length; j++) {
                System.out.print(ma4[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj[i].length; j++) {
                System.out.print(obj[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}