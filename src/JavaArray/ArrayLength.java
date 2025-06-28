package JavaArray;

public class ArrayLength {
    public static void main(String[] args) {
        String str[]=new String[]{"Hello","Hi","Lamarnika","Rajat"};
        int count=0;
        for(String i:str)
        {
            count++;
        }
        System.out.println(count);
    }
}
