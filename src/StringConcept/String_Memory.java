package StringConcept;

public class String_Memory {
    public static void main(String[] args)
    {
        // create string object using string literals :-  refer the existing string object iif existing object referring the same value.
        String s1 = "Lamarnika";
        String s2 = "Lamarnika";
        String s3 = "Prajapati";
        // create string object using new opeartor :- always create new string object.
        String s4 = new String("Lamarnika");
        String s5 = new String("Lamarnika");

        String s6 = new String("Lamarnika").intern();

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s4==s5);
        System.out.println(s1==s4);
        System.out.println(s1==s6);


    }

}
