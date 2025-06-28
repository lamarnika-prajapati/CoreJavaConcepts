package Collections_Interview_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(2, 5, 3, 7, 3, 5, 8));
        Collections.reverse(list);
        System.out.println(list);
    }

}
