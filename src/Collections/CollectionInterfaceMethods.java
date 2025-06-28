package Collections;

import javax.sound.midi.Soundbank;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionInterfaceMethods {
    public static void main(String[] args) {
        LinkedList<Integer> lk=new LinkedList<>(List.of(1,4,7,3,9,4,3,8,5,3));
        System.out.println("frequency of elements using frequency method");
        int i=Collections.frequency(lk,3);
        System.out.println(i);
        System.out.println("swaping of 2 elements using swap method");
        Collections.swap(lk,4,5);
        System.out.println(lk);
        System.out.println("Sorting of elements using sort method");
        Collections.sort(lk);
        System.out.println(lk);
        System.out.println("Searching of an element using binarySearch method");
        System.out.println(Collections.binarySearch(lk,8));
        System.out.println("reversing of elements using reverse method");
        Collections.reverse(lk);
        System.out.println(lk);
        System.out.println("shuffling/random rearrangment of elements using sort method");
        Collections.shuffle(lk);
        System.out.println(lk);
        System.out.println("Minimum elements using sort method");
        System.out.println(Collections.min(lk));
        System.out.println("Maximum elements using sort method");
        System.out.println(Collections.max(lk));
        System.out.println("replacement of occurrence of an elements using replaceAll method");
        Collections.replaceAll(lk,4,6);
        System.out.println(lk);
        System.out.println("Unmodifiable of elements using unmodifiable method");
        List<Integer> lk2=Collections.unmodifiableList(lk);
        //lk2.add(10);//unbale to modify the unmodifiable list
        System.out.println(lk2);


    }

}
