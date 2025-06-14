package Concept_Java;

public class EncapsulationClass {
    private float salary;
    public EncapsulationClass(float sal)
    {
        salary=sal;
    }
    public float getSalary()
    {
        return salary;
    }
    public void updateSalary(float sal)
    {
        salary+=sal;
    }
}
class MainEncapsulation
{
    public static void main(String[] args) {
        EncapsulationClass ec=new EncapsulationClass(10000);
        ec.updateSalary(2000);
        System.out.println(ec.getSalary());
    }
}
