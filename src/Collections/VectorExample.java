package Collections;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        System.out.println("Vector with default constructor");
        /*Vector<Character> vlist = new Vector<>(); //default constructor
        vlist.add('a');
        vlist.add('b');
        vlist.add('c');
        vlist.add('d');
        System.out.println(vlist);

        System.out.println("Vector with generic parameter constructor with collection object");
        Vector<Character> vlist1 = new Vector<>(vlist);
        System.out.println(vlist1);
        System.out.println();*/
        Vector<Character> vlist2 = new Vector<>(List.of('e', 'f', 'g'));//1,2,3
        System.out.println(vlist2);
        vlist2.addFirst('h');
        vlist2.add('i');
        vlist2.add(1,'j');
        vlist2.addElement('k');
        vlist2.insertElementAt('l',7);
        System.out.println(vlist2);

        vlist2.addLast('m');






        /*System.out.println("Vector with generic parameter constructor with user defined class object");
        CustomStudentClass cs = new CustomStudentClass(1, "abc", "mbc");
        CustomStudentClass cs1 = new CustomStudentClass(2, "abcd", "mbcd");
        CustomStudentClass cs2 = new CustomStudentClass(3, "abce", "mbcf");

        Vector<CustomStudentClass> vlist3 = new Vector<>(List.of(cs, cs1, cs2));

        for (CustomStudentClass stu : vlist3) {
            System.out.println(stu.getRollno() + " " + stu.getName() + " " + stu.getCollege());
        }
        System.out.println();

        Vector<CustomStudentClass> vlist4 = new Vector<>(vlist3);
        for (CustomStudentClass stu : vlist4) {
            System.out.println(stu.getRollno() + " " + stu.getName() + " " + stu.getCollege());
        }
        System.out.println();
        Vector<CustomStudentClass> vlist5 = new Vector<>(List.of(new CustomStudentClass(1, "abc", "mbc"), new CustomStudentClass(2, "abcd", "mbcd")));
        for (CustomStudentClass stu : vlist5) {
            System.out.println(stu.getRollno() + " " + stu.getName() + " " + stu.getCollege());
        }
        ListIterator<Character> litr = vlist.listIterator();
        while (litr.hasNext()) {
            Character c = litr.next();
            if (c.equals('c')) {
                litr.set('o');
                litr.add('k');

            }
        }
        System.out.println(vlist);*/

    }
}
