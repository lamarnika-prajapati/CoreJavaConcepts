package Core_Java;

import Concept_Java.*;  //import package to use public instance variables.

public class PubicSpecifiersOtherPackage {
public String clg;

    public static void main(String[] args) {

        PubicSpecifiers obj=new PubicSpecifiers();
        obj.college_Name="HCC"; //access public instance variables from public class
        System.out.println(obj.college_Name);
        obj.display(); //access public instance method from public class
        PubicSpecifiersOtherPackage obj1=new PubicSpecifiersOtherPackage();
        obj1.clg="RBC";
        System.out.println(obj1.clg);
        //PublicSpecifiers1 obj2=new PublicSpecifiers1(); we can't access a public instance
        // variable if it's class is not public.


    }
    
}
