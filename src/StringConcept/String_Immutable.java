package StringConcept;

public class String_Immutable {
    public static void main(String[] args)
    {
        String str = "lamarnika";
        System.out.println(str.hashCode());
        System.out.println("Modification 1: " + str);


        str = str + " Rajat";
        System.out.println(str.hashCode());
        System.out.println("Modification 2: " + str);

        str = str.concat(" Prajapati");
        System.out.println(str.hashCode());
        System.out.println("Modification 3: " + str);

        str.concat("Gudiya");
        System.out.println(str);
        System.out.println(str.hashCode());

        String str1 = "Kaku";
        str1 = "Prajapati";
        System.out.println(str1.concat(" Prajapati1"));
        System.out.println("Name: " + str1);


    }
}
