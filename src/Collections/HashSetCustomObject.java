package Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetCustomObject {
    public static void main(String[] args)
    {
        HashSet<CustomStudentClass> student = new HashSet<>(List.of(new CustomStudentClass(1, "Pooja", "Marwar")));
        student.add(new CustomStudentClass(2,"Deepa","NIT"));
        student.add(new CustomStudentClass(3,"Neha","JIT"));
        student.add(new CustomStudentClass(4,"Pari","CIT"));
        student.add(new CustomStudentClass(5,"Guddu","NIT"));

        for(CustomStudentClass st:student) {
            System.out.println(st.getRollno()+" "+st.getName()+" "+st.getCollege());
        }
        System.out.println();

        student.add(new CustomStudentClass(5,"Guddu","NIT"));
        //student.remove(new CustomStudentClass(3,"Neha","JIT")); this method does not work directly for custom class

        Iterator<CustomStudentClass> itr=student.iterator();
        while (itr.hasNext())
        {
            CustomStudentClass cs=itr.next();
            System.out.println(cs.getRollno()+" "+cs.getName()+" "+cs.getCollege());
        }
        System.out.println(student.size());
        System.out.println(student.isEmpty());
        System.out.println();
        Iterator<CustomStudentClass> itr1=student.iterator();
        while (itr1.hasNext())
        {
            CustomStudentClass cs=itr1.next();
            if(cs.getCollege().equals("NIT"))
            {
                System.out.println(cs.getRollno()+" "+cs.getName()+" "+cs.getCollege());
            }
        }
        System.out.println();
        Iterator<CustomStudentClass> itr2=student.iterator();
        while (itr2.hasNext())
        {
            CustomStudentClass cs=itr2.next();
            if(cs.getName().equals("Guddu"))
            {
                itr2.remove();
            }
        }
        System.out.println();
        for(CustomStudentClass st:student) {
            System.out.println(st.getRollno()+" "+st.getName()+" "+st.getCollege());
        }
        System.out.println();

        for(CustomStudentClass st:student) {
            System.out.println(st.getRollno()+" "+st.getName()+" "+st.getCollege());
        }
    }
}
