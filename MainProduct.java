import java.util.Scanner;

public class MainProduct{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String product = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();

        System.out.println("----------------------------------");

        Product android = new Product(product, price, quantity);

        android.displayOrder();
        android.calculateTotal();
        android.calculateDiscount();
        android.calculateFinalAmount();

        scanner.close();
    }
}
