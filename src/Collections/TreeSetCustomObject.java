package Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCustomObject {
    public static void main(String[] args) {
        TreeSet<CustomStudentClass> tstud=new TreeSet<>(Comparator.comparingInt(CustomStudentClass::getRollno));
        tstud.add(new CustomStudentClass(7,"Pooja","AAA"));
        tstud.add(new CustomStudentClass(3,"Dooja","BBB"));
        tstud.add(new CustomStudentClass(5,"Kooja","CCC"));
        for(CustomStudentClass cs:tstud)
        {
            System.out.println(cs.getRollno()+" "+cs.getName()+" "+cs.getCollege());
        }
        tstud.add(new CustomStudentClass(5,"Mooja","DDD"));
        for(CustomStudentClass cs:tstud)
        {
            System.out.println(cs.getRollno()+" "+cs.getName()+" "+cs.getCollege());
        }
        System.out.println(tstud.size());
        System.out.println(tstud.isEmpty());

        tstud.removeLast();
        tstud.removeFirst();
        for(CustomStudentClass cs:tstud)
        {
            System.out.println("After removal elements are: "+cs.getRollno()+" "+cs.getName()+" "+cs.getCollege());
        }
        Iterator<CustomStudentClass> itr=tstud.iterator();
        while (itr.hasNext())
        {
            CustomStudentClass cs=itr.next();
            if(cs.getRollno()==5)
            {
                itr.remove();
            }
        }

        tstud.add(new CustomStudentClass(8,"Rooja","EEE"));
        tstud.add(new CustomStudentClass(10,"Sooja","FFF"));
        tstud.add(new CustomStudentClass(4,"Aooja","GGG"));
        tstud.add(new CustomStudentClass(2,"Booja","HHH"));
        tstud.add(new CustomStudentClass(1,"Looja","III"));



        for(CustomStudentClass cs:tstud)
        {
            System.out.println("Elements are: "+cs.getRollno()+" "+cs.getName()+" "+cs.getCollege());
        }


    }
}
