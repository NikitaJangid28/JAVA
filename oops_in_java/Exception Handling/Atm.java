import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String Message){
        super(Message);
    }
}

public class Atm {
    private double balance;

    public Atm(double initialBalance){
        this.balance =initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw  new InsufficientBalanceException("Insufficient Balance! Your Current Balance is : "+balance);
        }else{
            balance-=amount;
            System.out.println("Withdrawn Successfully ! Remaining Balance: " +balance);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm myAtm = new Atm(5000);

        try {
            System.out.println("Enter withdrawn amount :");
            double amount = sc.nextDouble();

            if(amount <=0){
                throw  new IllegalArgumentException("Withdrawal amount must be greater than zero");
            }
            myAtm.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception : " + e.getMessage());
        } catch(IllegalArgumentException e){
            System.out.println("Invalid input : " +e.getMessage());
        } catch(Exception e){
            System.out.println("An unexcepected error occured: " +e.getMessage());
        } finally{
            System.out.println("transaction ended. Thank You for using our ATM");
            sc.close();
        }
    }
}
