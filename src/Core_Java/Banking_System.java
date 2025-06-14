package Core_Java;

public class Banking_System{
    public int account_id;
    protected float amount;
    String account_holder;
    public void accountOpen(int id, float amt, String name){
        account_id=id;
        amount=amt;
        account_holder=name;
    }
    public void account_details() {
        System.out.println("account id: "+account_id);
        System.out.println("account amount: "+amount);
        System.out.println("Name of account holder: "+account_holder);
    }
    public void deposit(float amt) {
        amount= amount+amt;
    }
    public void withdraw(float wid)
    {
        if(wid>amount)
            System.out.println("Insuficient amount");
        else
            amount = amount - wid;
    }
    public float checkbalance()
    {
        return amount;
    }
}
class Bank {
    public static void main(String[] args) {
        Banking_System cust=new Banking_System();
        cust.accountOpen(101,5000,"Lamarnika");
        cust.account_details();
        cust.deposit(2000);
        System.out.println("Available Balance: "+cust.checkbalance());
        cust.withdraw(1000);
        System.out.println("Available Balance: "+cust.checkbalance());
        cust.account_details();

    }
}
