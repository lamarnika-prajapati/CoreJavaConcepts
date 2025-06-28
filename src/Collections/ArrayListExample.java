package Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);list.add(20);list.add(30);list.add(40);list.add(50);
        System.out.println(list);
        System.out.println("Traverse with for loop");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("Traverse with iterator method");
        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Traverse with for each loop");
        for(Integer it:list)
        {
            System.out.println(it);
        }
    }
}
