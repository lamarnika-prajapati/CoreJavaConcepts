package AccessModifiers;
public class DefaultModifiers {
    String nm;
    protected String address;
     void display()
    {
        System.out.println(nm);
    }
}
class ChildClass extends DefaultModifiers
{
    void childmsg()
    {
        System.out.println(nm);
        System.out.println(address);
    }
}
class AccessDefaultModifiers
{
    public static void main(String[] args) {
        DefaultModifiers dm=new DefaultModifiers();
        dm.nm="Gudiya";
        dm.display();
        ChildClass cc=new ChildClass();
        cc.nm="Lamarnika";
        cc.address="Kotputli";
        cc.childmsg();
    }
}
