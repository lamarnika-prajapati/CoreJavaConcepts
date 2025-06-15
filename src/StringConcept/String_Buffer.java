package StringConcept;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Lamarnika");
        System.out.println(s1);
        System.out.println(s1.append(" Prajapati"));
        System.out.println(s1.insert(4,"Gudiya"));
        System.out.println(s1.replace(4,7,"Kaku"));
        System.out.println(s1.delete(4,11));
        System.out.println(s1.reverse());
        System.out.println(s1.charAt(9));
        System.out.println(s1.length());
        System.out.println(s1.reverse());
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(10,19));
        //System.out.println(s1.capacity());




    }
}
