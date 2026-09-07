import java.util.Scanner;

public class MainbankAccount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter accountNumber: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter account name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("----------------------------------------------");

        bankAccount cubillas = new bankAccount(accNumber, name, balance);

        cubillas.displayAccountInfo();
        cubillas.deposit(500.00);
        cubillas.withdraw(800.00);
        cubillas.checkBalance();

        scanner.close();
    }
}