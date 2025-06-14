package Concept_Java;

public interface InterfaceConstantVariable {
    String state="Rajasthan";
    int RajCode=100;
    void RajCodedisplay();

}
class ChildInterfaceConstantVariable implements InterfaceConstantVariable
{
    int RajCode=200;
    public ChildInterfaceConstantVariable()
    {
       // InterfaceConstantVariable.RajCode=300; it is not allowed to change public static final ariables
        System.out.println("Child interface class ");
    }
    public void RajCodedisplay()
    {
        System.out.println(InterfaceConstantVariable.RajCode); //Interface variable is static that need to
        // be called using class name
    }
}
class MainInterfaceConstantVariable
{
    public static void main(String[] args) {
        InterfaceConstantVariable ob=new ChildInterfaceConstantVariable();
        ob.RajCodedisplay();
        ChildInterfaceConstantVariable ch= (ChildInterfaceConstantVariable) ob;
        System.out.println(ch.RajCode);
        System.out.println(InterfaceConstantVariable.RajCode);
    }
}

