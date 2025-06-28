package JavaArray;

import javax.swing.*;
import java.util.Arrays;

public class OnceOccurranceElement {
    public static void main(String[] args) {
        int elementOccurrence[]=new int[]{6,2,4,8,2,6,8,5};
        for(int i=0;i<elementOccurrence.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<elementOccurrence.length;j++)
            {
                if(elementOccurrence[j]==elementOccurrence[i] && i!=j)
                {
                    flag=true;
                }
            }

            if(!flag)
            {
                System.out.println(elementOccurrence[i]);
            }
        }
    }
}

