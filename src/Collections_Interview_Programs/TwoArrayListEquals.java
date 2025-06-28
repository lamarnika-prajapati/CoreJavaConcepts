package Collections_Interview_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoArrayListEquals {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(List.of(2, 5, 3, 7, 3, 5, 8));
        ArrayList<Integer> list1 = new ArrayList<>(List.of(2, 8, 7, 3, 3, 5, 5));
        Collections.sort(list);
        Collections.sort(list1);
        if(list.equals(list1))
        {
            System.out.println("Both are equals");
        }
        else
        {
            System.out.println("Not equals");
        }
    }

}
