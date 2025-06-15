package StringConcept;

public class String_Compare {
    public static void main(String[] args) {
        {
            String s1 = "Gudiya";
            String s2 = "Gudiya";
            String s3 = "Kaku";
            String s4 = new String("Gudiya");
            String s5 = "gudiya";

            //  equals(), it is use to compare the values of the string objects.
//            System.out.println(s1.equals(s2));
//            System.out.println(s2.equals(s3));
//            System.out.println(s1.equals(s4));

            // equalsIgnoreCase, it is use to compare the values of the string objects with ignoring the case.
//            System.out.println(s1.equalsIgnoreCase(s5));
//            char G = 'G';
//            char g = 'g';
            int sum = 0;
            for(int i = 0; i < s1.length(); i++)
            {
                System.out.println(s1.charAt(i));
                sum+= (int)s1.charAt(i);
            }
            System.out.println("sum:" + sum);

            int sum1 = 0;
            for(int i = 0; i < s5.length(); i++)
            {
                System.out.println(s5.charAt(i));
                sum1+= (int)s5.charAt(i);
            }
            System.out.println("sum:" + sum1);
            System.out.println(s1.compareTo(s5));
            //System.out.println("G: " + (int) G);
//            System.out.println("g: " + (int) g);

            // compareTo(), It is use to compare value lexicographically and it returns an integer value that describes if first string is less than, equal to or greater than second string.
//            System.out.println(s1.compareTo(s2));


//            char R = 'R';
//            char r = 'r';

            //Unicode Values
//            System.out.println("R: " + (int) R);
//            System.out.println("r: " + (int) r);
//
//            String R1 = "Rajat";
//            String r1 = "rajat";
//            System.out.println(R1.compareTo(r1));

        }
    }
}
