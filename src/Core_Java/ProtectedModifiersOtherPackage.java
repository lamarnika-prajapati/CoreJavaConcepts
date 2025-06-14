package Core_Java;
import Concept_Java.ProtectedModifiers;
public class ProtectedModifiersOtherPackage extends ProtectedModifiers
{
    protected float rep_rate;
    protected void showing()
    {
        System.out.println(rep_rate);
        int_rate=8;
        System.out.println(int_rate);
    }
    public static void displaying()
    {
        ProtectedModifiersOtherPackage pp=new ProtectedModifiersOtherPackage();
        //ProtectedModifiers pm=new ProtectedModifiers();
      //  pm.int_rate;
        pp.int_rate=50;  // //protected variables and methods of parent class are
        // accessible in only child class.
        System.out.println(pp.int_rate);

    }
}
class AccessibleProtectedModifiers extends ProtectedModifiers
{
    public void display1()
    {
        System.out.println(int_rate);
    }
    public static void main(String[] args) {

        AccessibleProtectedModifiers ac= new AccessibleProtectedModifiers();
        ac.int_rate=50;
        System.out.println(ac.int_rate);
        ProtectedModifiersOtherPackage pk=new ProtectedModifiersOtherPackage();
        pk.rep_rate=10;
        System.out.println();
        //pk.int_rate=20; protected variables and methods of parent class are not accessible in another class except child class.
        pk.showing();
    }
}
