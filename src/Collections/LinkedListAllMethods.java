package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListAllMethods {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>(List.of(5, 10, 15, 20));
        intList.add(25);
        intList.add(30);
        System.out.println(intList);

        intList.addFirst(35);
        intList.addLast(40);
        System.out.println(intList);
        Collections.sort(intList);
        System.out.println(intList);

        System.out.println("get first element: " + intList.getFirst());
        System.out.println("get ith element: " + intList.get(4));
        System.out.println("get last element: " + intList.getLast());
        System.out.println("number of elements: " + intList.size());
        System.out.println(intList.isEmpty());
        System.out.println("Indexof value " + intList.indexOf(30));
        intList.add(6, 45);
        System.out.println("Indexof of last value " + intList.lastIndexOf(30));
        System.out.println("remove ith element: " + intList.remove(5));
        System.out.println("remove first element: " + intList.removeFirst());
        System.out.println("remove last element: " + intList.removeLast());
        System.out.println("Contains element: " + intList.contains(15));
        LinkedList<Integer> intList2 = new LinkedList<>();
        intList2.addAll(intList);
        System.out.println(intList2);
        System.out.println(intList);
        ListIterator<Integer> listItr = intList.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        ListIterator<Integer> listItr1 = intList.listIterator(intList.size());
        while (listItr1.hasPrevious()) {
            System.out.println(listItr1.previous());
        }
    }
}
