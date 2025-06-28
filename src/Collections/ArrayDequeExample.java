package Collections;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> arrayDeque=new ArrayDeque<>();
        //add methods
        System.out.println("Use of add methods");
        arrayDeque.add("Guddu");
        arrayDeque.add("Pooja");
        arrayDeque.addFirst("Deepa");
        arrayDeque.add("Neeru");
        arrayDeque.addLast("Neha");
        System.out.println(arrayDeque);
        System.out.println();

        //offer methods
        System.out.println("Use of offer methods");
        arrayDeque.offer("Aarti");
        arrayDeque.offerFirst("Dolly");
        arrayDeque.offerLast("Rashmi");
        System.out.println(arrayDeque);
        System.out.println();

        //peek methods
        System.out.println("Use of peek methods");
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
        System.out.println();

        //get methods
        System.out.println("Use of get methods");
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println();

        //contains method
        System.out.println("Use of contain method");
        System.out.println(arrayDeque.contains("Neha"));
        System.out.println();

        //size method
        System.out.println("Use of size method");
        System.out.println(arrayDeque.size());
        System.out.println();

        //remove methods
        System.out.println(arrayDeque);
        System.out.println("Use of remove methods");
        System.out.println(arrayDeque.remove());
        System.out.println(arrayDeque.remove("Aarti"));
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.removeLast());
        System.out.println(arrayDeque);
        arrayDeque.offer("Neeru");
        arrayDeque.offer("Pooja");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.removeFirstOccurrence("Neeru"));
        System.out.println(arrayDeque.removeLastOccurrence("Pooja"));
        System.out.println(arrayDeque);
        System.out.println();

        arrayDeque.offer("Guddu");
        arrayDeque.offer("Pooja");
        arrayDeque.offer("Neha");
        arrayDeque.offer("Neeru");
        System.out.println(arrayDeque);
        System.out.println();

        System.out.println("Use of poll methods");
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque);
        System.out.println();

        System.out.println("Use of stack push methods");
        arrayDeque.push("Lamarnika");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque);
    }
}
