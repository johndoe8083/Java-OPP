public class BankAccount {
    private String accNumber;
    private String accName;
    private double balance;
    private double deposit;
    private double withdraw;

    public BankAccount(String accNumber, String accName, double balance){
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;
    }

    public void displayAccountInfo(){
        System.out.println("Account Name: " + accName);
        System.out.println("Initial Balance: " + balance);
        System.out.println("--------------------------------------");
    }

    public void deposit(double amount){
        this.deposit = amount;
        balance += amount;
        System.out.println("Deposited amount: " + amount);
    }

    public void Withdraw(double withdraw){
        this.withdraw = withdraw;
        System.out.println("Enter withdrawal amount: " + withdraw);
    }

    public void checkBalance(){
        if(withdraw <= balance){
            balance -= withdraw;
            System.out.println("Withdrawal Successful");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
