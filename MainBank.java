import java.util.Scanner;

public class MainBank {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNumber = scanner.nextLine();

        System.out.println("Enter your account name: ");
        String accName = scanner.nextLine();

        System.out.println("Enter your initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount cubillas = new BankAccount(accNumber, accName, balance);

        cubillas.displayAccountInfo();
        cubillas.Withdraw(800.00);
        cubillas.deposit(500.00);
        cubillas.checkBalance();

        scanner.close();
    }
}
