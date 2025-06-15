package StringPrograms;

public class Split_Even_Strings {
    public static void main(String[] args) {

        String s1 = "Rajat will try to speak in englisha";
        String[] s2 = s1.split(" ");
        //for (String s3 : s2)
        for (int i = 0; i < s2.length; i++) {
            String temp = s2[i];
            if ((temp.length() % 2) == 0) {
                System.out.println(temp);
            }
        }
        System.out.println("------------------------------------------------");
        for (String s3 : s2) {
            if ((s3.length() % 2) == 0) {
                System.out.println(s3);
            }

        }


    }
}
