package Bank;
public class BankAccount{
    private String accno;
    private String name;
    private double balance;

    public BankAccount(String accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public String getAccno() {
        return accno;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccno(String accno) {
        this.accno = accno;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
   
}