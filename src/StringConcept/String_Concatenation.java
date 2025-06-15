package StringConcept;

public class String_Concatenation {
    public static void main(String[] args) {

        //using '+' operator
        String s1 = "Lamarnika"+" Prajapati";
        System.out.println(s1);

        //after string literals, all + will be treated as string concatenation
        String s2 = 40 + 50 + "Lam" + 60 + 20;
        System.out.println(s2);

        //Using concat() of String class;
        String s3 = "Rajat";
        String s4 = "Prajapati";
        System.out.println(s3.concat(s4));

        //Using append() of string builder and buffer class;

        StringBuilder a1 = new StringBuilder("Makrana ");
        StringBuilder a2 = new StringBuilder("City ");

        a1.append(a2);
        a1.append("Kotputali ");
        System.out.println("a1 " + a1);

        String a3 = a1.toString();
        System.out.println("a3 "+ a3);

        a2=a1;
        System.out.println("a2 " + a2);

        // using join(delimiter,elements) of String class Parameters:
        //delimiter – the sequence of characters to be used between each element.
        //elements – the elements to join together.
        String s5 = "Gudiya";
        String s6 = "Prajapati";
        String s7= String.join(" ", s5, s6);
        System.out.println(s7);
        String s8 = " ";
        String s9=s8.join("/", s5, s6);
        System.out.println(s9);

    }

}
