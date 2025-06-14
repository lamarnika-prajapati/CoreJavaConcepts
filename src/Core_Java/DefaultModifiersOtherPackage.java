package Core_Java;
import Concept_Java.DefaultModifiers;

class DefaultChild extends DefaultModifiers
{
    void childDisplay()
    {
        //System.out.println(nm); Default instance variables is not accessible in other package
        address="Makrana";
        System.out.println(address);
    }
}

public class DefaultModifiersOtherPackage {
    public static void main(String[] args) {
        DefaultModifiers dm=new DefaultModifiers();
        //dm.nm="lamarnika"; Default instance variables is not accessible in other package
        //dm.display(); Default instance variables is not accessible in other package
        DefaultChild dc=new DefaultChild();
        dc.childDisplay();
    }
}
