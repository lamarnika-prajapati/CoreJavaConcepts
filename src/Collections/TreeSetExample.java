package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(60);
        tset.add(70);
        tset.add(20);
        System.out.println(tset);
        System.out.println();

        System.out.println(tset.size());
        System.out.println(tset.isEmpty());
        System.out.println(tset.contains(20));

        System.out.println(tset.first());
        System.out.println(tset.last());
        System.out.println(tset.remove(70));
        System.out.println(tset);
        System.out.println();
        System.out.println(tset.getFirst());
        System.out.println(tset.getLast());
        System.out.println(tset.removeFirst());
        System.out.println(tset.removeLast());
        System.out.println(tset);
        System.out.println();
        tset.add(50);
        tset.add(30);
        tset.add(30);
        tset.add(100);
        tset.add(70);
        tset.add(60);
        tset.add(500);
        System.out.println(tset);
        System.out.println();

        System.out.println(tset.headSet(70, true));
        System.out.println(tset.tailSet(60, false));
        System.out.println(tset.subSet(50, false, 100, true));

        Iterator<Integer> it = tset.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Elements are: " + tset.descendingSet());
        Iterator<Integer> it1 = tset.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

    }
}
