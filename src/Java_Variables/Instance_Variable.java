package Java_Variables;
public class Instance_Variable {
    String st;
    int age;
    String comp;
    static String compo;
    public Instance_Variable(String str)
    {
        st=str;  // access instance variable directly
        compo=str;
    }
    public void printing()
    {
        System.out.println(st+age+comp); //access instance variable directly within Instance method without using object
    }

    public static void main(String[] args) {
        //System.out.println(st+age+comp); //can't access instance variable directly within the static context method without using object
        Instance_Variable iv = new Instance_Variable("Gudiya"); //access instance variable in static context using class pbject
        System.out.println(iv.st);
        System.out.println(iv.age);//print default value of int data type
        System.out.println(iv.comp); //print default value of  string type
        iv.printing();
    }
}
