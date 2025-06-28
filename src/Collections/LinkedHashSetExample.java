package Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lset=new LinkedHashSet<>();
        lset.add("Makrana");
        lset.add("Jaipur");
        lset.add("Ajmer");
        lset.add("Kota");
        System.out.println();
        System.out.println(lset);
        lset.add("Makrana");

        System.out.println();
        System.out.println(lset);

        System.out.println(lset.size());
        System.out.println(lset.contains("Ajmer"));
        System.out.println(lset.isEmpty());
        System.out.println("Reverse set: "+lset.reversed());
        System.out.println();
        System.out.println(lset);
        System.out.println("Remove Element: "+lset.remove("Kota"));
        System.out.println();

        System.out.println(lset);
        System.out.println(lset.getFirst());
        System.out.println(lset.getLast());
        System.out.println(lset.getClass());

        System.out.println(lset.removeFirst());
        System.out.println(lset);
        System.out.println(lset.removeLast());
        lset.addFirst("Jodhpur");
        System.out.println();
        System.out.println(lset);
        lset.addLast("Kotputli");
        System.out.println();
        lset.add(null);
        lset.add(null);
        System.out.println(lset);
        lset.clear();
        System.out.println(lset);
    }
}
