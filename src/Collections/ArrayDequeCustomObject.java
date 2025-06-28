package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayDequeCustomObject {
    public static void main(String[] args) {
        ArrayDeque<CustomStudentClass> studentarray=new ArrayDeque<>();
        studentarray.offer(new CustomStudentClass(1,"Guddu","BBA"));
        studentarray.offer(new CustomStudentClass(4,"Muddu","MBA"));
        studentarray.offer(new CustomStudentClass(3,"Luddu","LBA"));
        studentarray.offer(new CustomStudentClass(2,"Puddu","PBA"));
        studentarray.offer(new CustomStudentClass(5,"Ruddu","RBA"));

        for(CustomStudentClass stu:studentarray) {
            System.out.print("| "+stu.getRollno()+" "+stu.getName()+" "+stu.getCollege());
        }
        System.out.println();
        studentarray.offerLast(new CustomStudentClass(6,"Kuddu","KBA"));
        studentarray.offerFirst(new CustomStudentClass(7,"Ouddu","OBA"));

        for(CustomStudentClass stu:studentarray) {
            System.out.print("| "+stu.getRollno()+" "+stu.getName()+" "+stu.getCollege());
        }
        System.out.println();
        CustomStudentClass st=studentarray.poll();
        System.out.println("Remove front element: "+st.getRollno()+" "+st.getName()+" "+st.getCollege());

        CustomStudentClass st1=studentarray.pollLast();
        System.out.println("Remove rear element: "+st1.getRollno()+" "+st1.getName()+" "+st1.getCollege());

        Iterator<CustomStudentClass> itr=studentarray.iterator();
        while (itr.hasNext())
        {
            CustomStudentClass cst= itr.next();
            System.out.println(cst.getRollno()+" "+cst.getName()+" "+cst.getCollege());
        }
        CustomStudentClass cp= studentarray.peek();
        System.out.println("Retrieve front element: "+cp.getRollno()+" "+cp.getName()+" "+cp.getCollege());
        CustomStudentClass cp1= studentarray.peekLast();
        System.out.println("Retrieve front element: "+cp1.getRollno()+" "+cp1.getName()+" "+cp1.getCollege());

        Iterator<CustomStudentClass> itr1=studentarray.iterator();
        while (itr1.hasNext())
        {
            CustomStudentClass cst= itr1.next();
            if(cst.getCollege().equals("PBA"))
            {
                cst.setName("Buggu");
            }
        }
        for(CustomStudentClass stu:studentarray) {
            System.out.print("| "+stu.getRollno()+" "+stu.getName()+" "+stu.getCollege());
        }
        Iterator<CustomStudentClass> itr2=studentarray.iterator();
        while (itr2.hasNext())
        {
            CustomStudentClass cst= itr2.next();
            if(cst.getName().equals("Luddu"))
            {
                itr2.remove();
            }
        }
        System.out.println();
        //Collections.sort(studentarray); Collections class does not work with queue type of collection.
        for(CustomStudentClass stu:studentarray) {
            System.out.print("| "+stu.getRollno()+" "+stu.getName()+" "+stu.getCollege());
        }
    }
}
