package StringPrograms;

public class String_Reverse_Prog {
    public static void main(String[] args) {
        String str = "Lamarnika";

        int j=0;
        int size = str.length();
        char[] ch = new char[size];
        for(int i= (str.length()-1);i>=0;i--)
        {
            ch[j++]= str.charAt(i);
            //j++;
        }
            System.out.println(ch);

    }


}
