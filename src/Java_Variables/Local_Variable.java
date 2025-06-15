package Java_Variables;

public class Local_Variable {
    public static void main(String[] args) {
        int a=5;
        if(a==5)
        {
            float f= 2.3F;
            System.out.println(a);
            System.out.println(f+a);
        }
        // f will not accessible outside if block
        //System.out.println(f);
    }
}
