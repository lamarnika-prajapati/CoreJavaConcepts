package JavaArray;
public class PalindromArray {
    public static void main(String[] args) {
        int palindromArray[]=new int[]{2,5,2,6,7,2,5,2};
        int n=palindromArray.length;
        boolean isPlaindrom=true;
        for(int k=0;k<=n/2;k++)
        {
            if(palindromArray[k]!=palindromArray[n-1-k]) {
                isPlaindrom=false;
                break;
            }
        }
        if(isPlaindrom)
        {
            System.out.println("Palindrom");
        }
        else {
            System.out.println("Not Palindrom");
        }
    }
}
