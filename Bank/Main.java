package Bank;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number");
        String accountno=sc.nextLine();
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter Initial Balance");
        double balance=sc.nextDouble();
        BankAccount account = new BankAccount(accountno, name, balance);
        System.out.println("Enter amount to deposit:");
        double depositInput = sc.nextDouble();
        System.out.println("Enter amount to withdraw:");
        double withdrawInput = sc.nextDouble();
        account.deposit(depositInput);
        account.withdraw(withdrawInput);
        System.out.println("Final Balance: " + account.getBalance());
        
    }
}
