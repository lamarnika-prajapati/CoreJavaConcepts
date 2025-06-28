package JavaArray;

public class StringTypeArray {
    public static void main(String[] args) {
        String sa[]=new String[]{"Guddu", "Lamarnika", "Rajat"};
        int lengthsa=sa.length;
        for(int i=0;i<lengthsa;i++)
        {
            System.out.println(sa[i]);
            System.out.println(sa[i].hashCode());
        }
        System.out.println(sa[1]);
        System.out.println(sa[1].hashCode());
        sa[1]="Prajapati"; //create new address for updated value.
        for(int i=0;i<sa.length;i++)
        {
            System.out.println(sa[i]);
            System.out.println(sa[i].hashCode());
        }
    }
}
