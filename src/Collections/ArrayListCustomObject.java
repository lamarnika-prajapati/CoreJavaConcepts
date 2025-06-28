package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCustomObject {
    public static void main(String[] args) {
        ArrayList<CustomStudentClass> studentList=new ArrayList<>();
        studentList.add(new CustomStudentClass(101,"Gudiya","MDS"));
        studentList.add(new CustomStudentClass(102,"Gudiya1","MDS1"));
        studentList.add(new CustomStudentClass(103,"Gudiya2","MDS2"));
        studentList.add(new CustomStudentClass(104,"Gudiya3","MDS3"));


        Iterator<CustomStudentClass> studentIterator=studentList.iterator();
        while (studentIterator.hasNext())
        {

            CustomStudentClass stdobj=studentIterator.next();
            System.out.println("Rollno: "+stdobj.getRollno()+" Name: "+stdobj.getName()+" College: "+stdobj.getCollege());
        }

        studentList.remove(1);
        CustomStudentClass s2=studentList.get(2);
        System.out.println(studentList.size());
        System.out.println(s2.getCollege()+s2.getName()+s2.getRollno());
        System.out.println(studentList.get(2).getRollno());
        System.out.println(studentList.get(2).getName());
        System.out.println(studentList.get(2).getCollege());

        Iterator<CustomStudentClass> studentIterator1=studentList.iterator();
        while (studentIterator1.hasNext())
        {
            CustomStudentClass s1=studentIterator1.next();
            System.out.println("Rollno: "+s1.getRollno()+" Name: "+s1.getName()+" College: "+s1.getCollege());

        }

    }
}
