package Collections_Interview_Programs;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElementStack {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(2,5,3,7,3,5,8));
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(!(list1.contains(list.get(i))))
            {
                list1.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(list1);
        System.out.println(list);
    }
}
