package StringConcept;

public class String_SubString {
    public static void main(String[] args) {
        //substring(begin indx(inclusive), end indx(exclusive))
        String s1 = "Lamarnika";
        System.out.println(s1.substring(0,8));
        System.out.println(s1.substring(0,5));
        System.out.println(s1.substring(0,9));

        String s2 = s1.substring(0,9);
        System.out.println(s2);
        System.out.println(s2.substring(4,8));

    }
}
