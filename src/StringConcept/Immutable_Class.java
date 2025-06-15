package StringConcept;

final class Student
{
    final String s1;
    public Student(String s1)
    {
        this.s1 = s1;
    }
    public String getter()
    {
        return s1;
    }
    public void setter(String s2)
    {
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
public class Immutable_Class {
    public static void main(String[] args) {
        Student str = new Student("Lamarnika");
        System.out.println(str.getter());
        System.out.println(str.hashCode());
        str.setter("Prajapati");
        System.out.println(str.hashCode());


    }
}
