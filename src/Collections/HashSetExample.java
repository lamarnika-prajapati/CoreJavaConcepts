package Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hset=new HashSet<>(List.of(100,600));
        hset.add(200);
        hset.add(500);
        hset.add(900);
        hset.add(400);
        System.out.println(hset);// add all the elements in unorder way
        hset.add(900);// not adding duplicate value
        System.out.println(hset);
        System.out.println(hset.size());
        System.out.println(hset.contains(400));
        System.out.println(hset.isEmpty());
        System.out.println(hset.remove(900));
        System.out.println(hset);
        hset.clear();
        hset.add(null);
        hset.add(null);
        System.out.println(hset);
    }
}
