package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListConstructor {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>();
        ArrayList<String> list2= new ArrayList<>(30);
        ArrayList<String> list3= new ArrayList<>(List.of("Rajat","Lamarnika"));
        list3.add("Gudiya");
        System.out.println(list3);
        Collections.sort(list3);
        System.out.println(list3);
        Iterator<String> l3=list3.iterator();
        while (l3.hasNext())
        {
            System.out.println(l3.next());
        }

    }
}
