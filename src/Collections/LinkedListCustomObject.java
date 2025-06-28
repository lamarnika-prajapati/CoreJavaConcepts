package Collections;
import java.util.LinkedList;
import java.util.List;
public class LinkedListCustomObject {
    public static void main(String[] args) {
        CustomStudentClass stu = new CustomStudentClass(1, "Pooja", "MBS");
        CustomStudentClass stu1 = new CustomStudentClass(2, "Mooja", "BBS");
        CustomStudentClass stu2 = new CustomStudentClass(3, "Dooja", "KBS");
        CustomStudentClass stu3 = new CustomStudentClass(4, "Looja", "YBS");

        LinkedList<CustomStudentClass> student = new LinkedList<>(List.of(stu, stu1, stu2, stu3));
        for (CustomStudentClass stud : student) {
            System.out.println(stud.getName()+" " + stud.getName()+" "+stud.getCollege());
        }
        for(int i=0;i< student.size();i++)
        {
            CustomStudentClass st=student.get(i);
            System.out.println(st.getName() +" "+ st.getName()+" "+st.getCollege());
        }
        student.add(new CustomStudentClass(5,"Rooja","UBS"));
        for (CustomStudentClass stud : student) {
            System.out.println(stud.getName()+" " + stud.getName()+" "+stud.getCollege());
        }
    }
}
