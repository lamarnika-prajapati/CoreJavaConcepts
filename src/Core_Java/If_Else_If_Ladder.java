package Core_Java;

import java.util.Scanner;

public class If_Else_If_Ladder {
    public static void main(String[] args) {
        int per;
        System.out.println("enter percentage");
        Scanner sc= new Scanner(System.in);
        per=sc.nextInt();
        if(per>=75)
        {
            System.out.println("1st division");
        } else if (per>=60 && per<75) {
            System.out.println("2nd Division");

        }
        else if(per>=45 && per<=60 )
        {
            System.out.println("3rd Division");
        }
        else {
            System.out.println("Fail");
        }
    }
}
