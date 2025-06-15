package StringPrograms;

public class Palindrome_String {
    public static void main(String[] args) {
//        StringBuilder s1 = new StringBuilder("lamal");
//        StringBuilder s3 = new StringBuilder("");
        StringBuffer s1 = new StringBuffer("lamal");
        StringBuffer s3 = new StringBuffer("");

        //Using reverse()
       /* s3 = s1.reverse();
        if (s3.equals(s1)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }*/
        //Using for loop
        for (int i = (s1.length()-1);i>=0; i--)
        {
            s3= s3.append(s1.charAt(i));
        }
        System.out.println("reverese '"+s3+"'");
        System.out.println("original '"+s1+"'");

//        if (s3.equals(s1)) {  //It won't work in case of StringBuilder and StringBuffer
//        if (s3.compareTo(s1) ==0) {
        if (s3.toString().equals(s1.toString())) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
