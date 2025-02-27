package Constructor;

class Bank {
    int account;
    int balance;
    Bank(){
        account=258963;
        balance=25000;
    }
    public void Show(){
        System.out.println("Account Number : "+account);
        System.out.println("Balance in Account : "+balance);
    }
}
public class DefaultConstr{
    public static void main(String[] args) {
        Bank b = new Bank();
        b.Show();
    }
}
