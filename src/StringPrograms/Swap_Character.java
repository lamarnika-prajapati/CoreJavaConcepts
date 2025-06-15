package StringPrograms;

public class Swap_Character {
    public static void main(String[] args) {
        String s1 = "Anitaa";
        char temp;
        char ch[] = s1.toCharArray();
       /* for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]);

        }*/
        for(int i=0;i<ch.length-1;i+=2)
        {
            temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;

        }
      
      // s1= Arrays.toString(ch).replace("[","").replace("]","")
       //        .replace(",","").replace(" ","");
      //  System.out.println(s1);
        String s3 = new String(ch);
        System.out.println(s3);

    }
}
