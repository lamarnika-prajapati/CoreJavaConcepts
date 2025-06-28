package Collections;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueueWithCustomObject {
    public static void main(String[] args) {
        PriorityQueue<CustomStudentClass> pqueue=new PriorityQueue<CustomStudentClass>(Comparator.comparingInt(CustomStudentClass::getRollno));
        pqueue.offer(new CustomStudentClass(4,"Guddu","GML"));
        pqueue.offer(new CustomStudentClass(3,"Buddu","BML"));
        pqueue.offer(new CustomStudentClass(1,"Muddu","MML"));
        pqueue.offer(new CustomStudentClass(2,"Luddu","LML"));

        for(CustomStudentClass cs:pqueue)
        {
            System.out.println(cs.getRollno() +" "+ cs.getName()+" "+ cs.getCollege());
        }
        System.out.println(pqueue.peek());
        System.out.println(pqueue.poll());
        PriorityQueue<CustomStudentClass> pqueue1= new PriorityQueue<>(Comparator.comparingInt
                (CustomStudentClass::getRollno));
        while(!pqueue.isEmpty())
        {
            CustomStudentClass cs1= pqueue.poll();
            pqueue1.add(cs1);
            System.out.println(cs1.getRollno() +" "+ cs1.getName()+" "+ cs1.getCollege());
        }
        for(CustomStudentClass cs2:pqueue1)
        {
            System.out.println(cs2.getRollno() +" "+ cs2.getName()+" "+ cs2.getCollege());

        }
    }
}
