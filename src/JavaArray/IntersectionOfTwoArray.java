package JavaArray;

import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int interSectionArray1[]=new int[]{3,6,4,2,6,8};
        int interSectionArray2[]=new int[]{5,8,4,4,9,6};
        HashSet<Integer> arraySet1=new HashSet<>();
        HashSet<Integer> arraySet2=new HashSet<>();
        for(int num:interSectionArray1)
        {
            arraySet1.add(num);
        }
        for(int num:interSectionArray2)
        {
            arraySet2.add(num);
        }

            System.out.println(arraySet1);
            System.out.println(arraySet2);
            for(int num:arraySet2)
            {
                if(arraySet1.contains(num))
                {
                    System.out.println(num);
                }
            }


    }
}
