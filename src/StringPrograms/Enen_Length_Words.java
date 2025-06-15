package StringPrograms;

public class Enen_Length_Words {
        public static void main(String[] args) {

            String s1 = "Rajat will try to speak in englisha";
            String s2 = "";
            int pos = 0;
            for (int i = 0; i < s1.length(); i++) {

                if ((s1.charAt(i) == ' ')) {
                    if ((pos % 2) == 0) {
                        System.out.println(s2);

                    }
                    s2 = "";
                    pos = 0;
                } else {
                    ++pos;
                    s2 = s2 + s1.charAt(i);
                    //System.out.println("each word: " + s2);
                    if(i==s1.length()-1)
                    {
                        if ((pos % 2) == 0)
                            System.out.println(s2);

                    }
                }
            }


    }
}
