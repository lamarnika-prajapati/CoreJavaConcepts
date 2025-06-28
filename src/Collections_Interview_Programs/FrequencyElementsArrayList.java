package Collections_Interview_Programs;

import java.util.Collections;
import java.util.Stack;

public class FrequencyElementsArrayList {
    public static void main(String[] args) {
        Stack<String> slist = new Stack<>();
        slist.push("Guddu");
        slist.push("Neha");
        slist.push("Deepa");
        slist.push("Neha");
        slist.push("Deepa");
        slist.push("Neha");
        Stack<String> st1 = new Stack<>();

        for (String st : slist) {

            if (!(st1.contains(st))) {
                System.out.println(st+" "+Collections.frequency(slist, st));
                st1.push(st);
            }
        }
    }
}
