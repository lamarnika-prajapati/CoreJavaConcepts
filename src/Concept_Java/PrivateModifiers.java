package Concept_Java;

public class PrivateModifiers {
    private int account_id;

    public void setter(int ai)
    {
        account_id=ai; //private instance variables are only accessible inside same class
    }
    private void updater(int ui)
    {

        account_id=account_id+ui;
    }
    public void display()
    {
        updater(5); //private instance methods are only accessible inside same class
        System.out.println(account_id);
    }
}
class AccessModifiers
{
    public static void main(String[] args) {
        PrivateModifiers obj=new PrivateModifiers();
        //obj.account_id=101;  private instance variables are not accessible inside other class
        obj.setter(101);
        //obj.updater(5); private instance methods are not accessible inside other class
        obj.display();
    }
}
