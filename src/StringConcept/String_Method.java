package StringConcept;

public class String_Method {
    public static void main(String[] args) {
        String s1 = "Lamarnika";
        String s2 = " Prajapati ";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s2.trim());
        System.out.println(s1.startsWith("La"));
        System.out.println(s1.startsWith("am"));
        System.out.println(s1.endsWith("ak"));
        System.out.println(s1.endsWith("ka"));
        System.out.println(s1.charAt(3));
        System.out.println(s1.charAt(8));
        System.out.println(s1.length());
        System.out.println(s1.intern());
        //valueOf() method is used to convert the another data type obj to String obj.
        int a= 5;
        System.out.println(10+a);
        String s3 = String.valueOf(a);
        System.out.println(10+s3);
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.indexOf("h"));













    }
}

