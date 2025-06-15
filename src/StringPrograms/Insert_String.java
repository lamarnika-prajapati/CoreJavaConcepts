package StringPrograms;

public class Insert_String {
    public static void main(String[] args) {

        //Using String object
        String s1="Lamarnika";
        String s2="Guddu";
        String p1=s1.substring(0,4);
        String p2= s1.substring(4);
        String p3= p1+s2+p2;
        System.out.println(p3);

        //Using String Builder object
        StringBuilder sb= new StringBuilder("Lamarnika");
        sb.insert(4,"Guddu");
        System.out.println(sb);

        //Uisng for loop
        String f1 = "Lamarnika";
        String f2 = "Guddu";
        String f3="";
        for(int i=0;i<f1.length();i++)
        {
            f3=f3+f1.charAt(i);
            if(i==3)
            {
                f3=f3+f2;
                break;
            }
        }
        for(int i=4;i<f1.length();i++)
        {
            f3=f3+f1.charAt(i);

        }
        System.out.println(f3);


    }
}
