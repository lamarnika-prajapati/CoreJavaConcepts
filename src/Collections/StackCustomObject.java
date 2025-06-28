package Collections;
import java.util.Stack;
public class StackCustomObject {
    public static void main(String[] args) {
        Stack<CustomStudentClass> stack1=new Stack<>();// we can't pass any existing collection
        stack1.push(new CustomStudentClass(1, "Lara","bac"));
        stack1.push(new CustomStudentClass(2, "Mara","baac"));
        stack1.push(new CustomStudentClass(3, "Kara","badc"));
        for(CustomStudentClass stu:stack1)
        {
            System.out.println(stu.getRollno() +" "+stu.getName()+" "+stu.getCollege());
        }
        stack1.pop();
        for(CustomStudentClass stu:stack1)
        {
            System.out.println(stu.getRollno() +" "+stu.getName()+" "+stu.getCollege());
        }
        CustomStudentClass st=stack1.peek();
        System.out.println(st.getRollno()+" "+st.getName()+" "+st.getCollege());
        System.out.println(stack1.empty());
       // CustomStudentClass cs=new CustomStudentClass(2,"Mara","baac");
       // System.out.println(stack1.search(cs)) it doesn't work as equals method needs to be
        // override into customStduent class
    }
}
