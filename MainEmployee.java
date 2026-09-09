import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Employee hours: ");
        double hours = scanner.nextDouble();

        System.out.println("------------------------------------------");

        Employee cubillas = new Employee(name, rate, hours);

        cubillas.displayEmployeeInfo();

        scanner.close();
    }
}
