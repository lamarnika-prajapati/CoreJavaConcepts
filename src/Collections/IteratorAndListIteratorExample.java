package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIteratorExample {
    public static void main(String args[]) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("John");//Adding object in arraylist
        list.add("Peter");
        list.add("Lucy");
        list.add("Johnson");
        //Traversing list through Iterator
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()) {
            String str=itr.next();
            if(str.equals("Peter"))
            {
                itr.remove();
            }
            else {
                System.out.println(str);
            }
        }
        ListIterator<String> listItr1 = list.listIterator();
        while (listItr1.hasPrevious()) {
            System.out.println(listItr1.previous());
        }

    }
}
