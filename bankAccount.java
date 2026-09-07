public class bankAccount {
    private String accNumber;
    private String name;
    private double balance;

    public bankAccount(String accNumber, String name, double balance){
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative");
            return;
        }
        balance += amount;
        System.out.println("Deposited amount: " + amount);
    }

    public void withdraw(double amount){
        if (amount < 0) {
            System.out.println("Withdrawal amount cannot be negative");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance(){
        System.out.println("Current balance: " + balance);
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Name: " + name);
        System.out.println("Account balance: " + balance);
    }
}