package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> qlist=new LinkedList<Integer>(List.of(300,500));
        qlist.offer(100);
        qlist.offer(200);
        System.out.println("Elements are: "+qlist);
        System.out.println(qlist.poll());// return head element and remove it
        System.out.println("After removal of head element: "+qlist);
        System.out.println(qlist.peek());// return head element
        System.out.println(qlist.size());
        System.out.println(qlist.isEmpty());
        System.out.println(qlist);


    }
}
