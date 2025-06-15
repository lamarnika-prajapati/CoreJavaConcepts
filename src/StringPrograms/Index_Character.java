package StringPrograms;

import java.util.Scanner;

public class Index_Character {
    public static void main(String[] args) {
        String s1="Lamarnika";
        Scanner sc=new Scanner(System.in);
        int ind = sc.nextInt();
        for(int i=0;i<s1.length();i++)
        {
            if(i==ind)
            {
                System.out.println(s1.charAt(i));
            }
        }
    }
}
