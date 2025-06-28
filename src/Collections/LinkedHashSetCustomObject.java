package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCustomObject {
    public static void main(String[] args) {
        LinkedHashSet<CustomStudentClass> clinkedhash=new LinkedHashSet<>();
        clinkedhash.add(new CustomStudentClass(1,"a","b"));
        clinkedhash.add(new CustomStudentClass(3,"c","d"));
        clinkedhash.add(new CustomStudentClass(2,"e","f"));

        for(CustomStudentClass cs:clinkedhash)
        {
            System.out.println(cs.getRollno()+" "+cs.getName()+" "+cs.getCollege());
        }
        System.out.println(clinkedhash.size());
        System.out.println(clinkedhash.isEmpty());
        clinkedhash.addFirst(new CustomStudentClass(4,"g","h"));
        for(CustomStudentClass cs:clinkedhash)
        {
            System.out.println(cs.getRollno()+" "+cs.getName()+" "+cs.getCollege());
        }

        for(CustomStudentClass cs:clinkedhash)
        {
            if(cs.getRollno()==3) {

                cs.setName("k");
            }
        }
        System.out.println();
        for(CustomStudentClass cs:clinkedhash)
        {
            System.out.println(cs.getRollno()+" "+cs.getName()+" "+cs.getCollege());
        }
        Iterator<CustomStudentClass> itr=clinkedhash.iterator();
        while(itr.hasNext())
        {
            CustomStudentClass cs=itr.next();
            if(cs.getRollno()==3) {
                itr.remove();
            }
        }
        System.out.println();
        for(CustomStudentClass cs:clinkedhash)
        {
            System.out.println(cs.getRollno()+" "+cs.getName()+" "+cs.getCollege());
        }

    }
}
