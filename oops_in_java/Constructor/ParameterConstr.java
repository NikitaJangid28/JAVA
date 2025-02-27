class Bank{
    int acc;
    int bal;
    Bank(int a, int b){
        acc=a;
        bal=b;
        System.out.println("Account Number : " +acc);
        System.out.println("Balance : " +bal);
    }
}
public class ParameterConstr {
    public static void main(String[] args) {
        Bank b = new Bank(258741, 500000);
    }
}
