package Collections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> qlist=new PriorityQueue<>(List.of(9,5,1,7,2,8));
        System.out.println(qlist);
        while (!qlist.isEmpty())
        {
            System.out.println(qlist.peek());
            qlist.poll();
        }

        qlist.offer(6);
        qlist.offer(4);
        qlist.add(10);
        System.out.println(qlist);

        System.out.println("poll element: "+qlist.poll());
        System.out.println(qlist);
        qlist.remove();
        System.out.println(qlist.element());
        System.out.println(qlist.peek());
        System.out.println(qlist);
        System.out.println(qlist.size());
        System.out.println(qlist.contains(1));
        System.out.println(qlist.remove(6));
        System.out.println(qlist);
    }
}
