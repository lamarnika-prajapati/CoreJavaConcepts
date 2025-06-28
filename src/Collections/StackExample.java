package Collections;
import java.util.List;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        System.out.println("Stack with typesafe");
        Stack<String> stackstring=new Stack<>();// we can't pass any existing collection
        // object as it has only default constructor
        stackstring.push("Hello");
        stackstring.push("Hi");
        System.out.println(stackstring);

        System.out.println("Stack without typesafe");
        Stack stackList=new Stack();
        System.out.println("Empty stack: "+stackList);
        if(stackList.empty())
        {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
        stackList.push(111);
        stackList.push('s');
        stackList.push("Guddu");
        stackList.push(263.87);
        stackList.push(656);
        System.out.println(stackList);
        if(stackList.empty())
        {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
        System.out.println("Top element of stack: "+stackList.peek());
        stackList.pop();
        stackList.pop();
        System.out.println("Top element of stack after deletion: "+stackList.peek());
        if((stackList.search('l'))!=-1) {
            System.out.println("Element exist into the stack");
        }
        else{
            System.out.println("Element not exist into the stack");

        }
        System.out.println(stackList);
        System.out.println(stackList.size());
        stackList.add(50);
        System.out.println(stackList);
        System.out.println(stackList.indexOf("Guddu"));
        stackList.add(2,"Manju");
        System.out.println(stackList.get(2));
        System.out.println(stackList);
    }
}
