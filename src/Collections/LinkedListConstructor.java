package Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LinkedListConstructor {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1000);
        list.add(2000);
        list.add(3000);
        list.addLast(4000);
        System.out.println(list);
        Iterator<Integer> stringitr = list.iterator();
        while (stringitr.hasNext()) {
            System.out.println(stringitr.next());
        }
        LinkedList<Integer> list1 = new LinkedList<>(list);
        for (Integer i : list1) {
            System.out.println(i);
        }
        LinkedList<Integer> list2 = new LinkedList<>(List.of(100, 200, 300, 400));
        for (Integer i2 : list2) {
            System.out.println(i2);
        }
    }
}
