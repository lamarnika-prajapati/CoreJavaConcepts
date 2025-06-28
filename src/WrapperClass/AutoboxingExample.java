package WrapperClass;
public class AutoboxingExample {
    public static void main(String[] args) {
        short s=50;
        Short s1=s; //autoboxing
        Short s2=Short.valueOf(s); // conversion manually
        System.out.println(s1);
        System.out.println(s2);

        int a=5;
        Integer a1=a; //autoboxing support the conversion the primitive type to its corresponding wrapper class
        Integer b1= Integer.valueOf(a);// converting manually primitive type to Integer object
        //Integer b2= s1;//doesn't support autoboxing with up typecasting
        Integer b4=Integer.valueOf(s1);// converting manually primitive type to Integer object
        System.out.println(a1);
        System.out.println(b1);

        int str=2;
        String str1=String.valueOf(str);
        System.out.println(str1);
        String str4="Guddu";
        //Integer str3=Integer.valueOf(str4); throw exception numberformaterror
        //System.out.println(str3);
    }
}
