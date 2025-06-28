package Collections_Interview_Programs;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SecondLargestElementLinkedList {

    public int secondLargestElement(LinkedList<Integer> list1)
    {
        Collections.sort(list1);
        return (list1.get(list1.size()-2));
    }
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(List.of(4,2,7,5,6,3,9));
        System.out.println(list);
        SecondLargestElementLinkedList obj=new SecondLargestElementLinkedList();
        System.out.println("Second largest element: "+obj.secondLargestElement(list));
        list.add(8);
        System.out.println(list);
        System.out.println("Second largest element: "+obj.secondLargestElement(list));

    }
}
