package Collections;
import java.util.*;
public class ArrayListAllMethods {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("Deepika");
        list1.add("Lamarnika");
        list1.add("Neha");
        list1.add("Pari");

        System.out.println("Elements are: ");
        Iterator<String> it=list1.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("Added new elements at 2nd position");
        list1.add(2,"Guddu");

        System.out.println("Element at 1st position: "+list1.get(1));
        System.out.println("Position of element 'Neha' "+ list1.indexOf("Neha"));
        System.out.println("Elements are: ");
        Iterator<String> it1=list1.iterator();
        while (it1.hasNext())
        {
            System.out.println(it1.next());
        }

        System.out.println("set/replace a new elements at 4th position");
        list1.set(4,"Palak");

        System.out.println("Elements are: ");
        Iterator<String> it2=list1.iterator();
        while (it2.hasNext())
        {
            System.out.println(it2.next());
        }
        System.out.println("Elements with listIterator: ");
        ListIterator<String> arritr=list1.listIterator(list1.size());
        while (arritr.hasPrevious())
        {
            System.out.println(arritr.previous());
        }

        System.out.println("Element size "+list1.size());
        System.out.println("Remove at index 3rd "+list1.remove(3));
        System.out.println("Remove element "+list1.remove("Palak"));
        System.out.println("Collection is empty "+list1.isEmpty());
        System.out.println("Is collection contains 'Lamarnika' "+list1.contains("Lamarnika") );
        System.out.println("Elements are of first  arraylist: ");
        Iterator<String> it8=list1.iterator();
        while (it8.hasNext())
        {
            System.out.println(it8.next());
        }
        ArrayList<String> list2=new ArrayList<String>();
        list2.addAll(list1);
        System.out.println("Elements are of second arraylist: ");
        Iterator<String> it3=list2.iterator();
        while (it3.hasNext())
        {
            System.out.println(it3.next());
        }

        System.out.println("Is Str arraylist equals to list2 arraylist "+list1.equals(list2));
        System.out.println("Convert to Array and below are array elements");
        Object[] arr= list1.toArray();
        for (Object obj:arr)
        {
            System.out.println(obj);
        }
        list1.sort(Comparator.naturalOrder());

        System.out.println("Elements are in ascending order ");
        Iterator<String> it4=list1.iterator();
        while (it4.hasNext())
        {
            System.out.println(it4.next());
        }
        list1.sort(Comparator.reverseOrder());
        System.out.println("Elements are in descending order ");
        Iterator<String> it5=list1.iterator();
        while (it5.hasNext())
        {
            System.out.println(it5.next());
        }

        System.out.println("Cloning the elements");
        ArrayList<String> al1= (ArrayList<String>) list1.clone();

        System.out.println("Elements are ");
        Iterator<String> it6=al1.iterator();
        while (it6.hasNext())
        {
            System.out.println(it6.next());
        }

        System.out.println("a portion of the list");
        List<String> sub = list1.subList(1,3);// sublist method returns List type
        System.out.println(list1);
        System.out.println(sub);

        list1.clear();
        System.out.println(list1.isEmpty());

    }
}
