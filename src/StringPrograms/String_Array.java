package StringPrograms;

import java.util.Scanner;

public class String_Array {
    public static void main(String[] args) {
        String[] s1= new String [3];
        Scanner sc = new Scanner(System.in);
       // String s2="";
        for(int i=0;i<s1.length;i++)
        {
            System.out.println("Enter string for pos: "+i+" ");
            s1[i]=sc.nextLine();

        }
        for(int i=0;i<s1.length;i++)
        {
            System.out.println("String of array pos: "+i+" "+s1[i]);
        }

    }
}
