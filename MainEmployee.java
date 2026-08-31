import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Employee Name: ");
        double rate = scanner.nextDouble();

        System.out.print("Employee Name: ");
        double hours = scanner.nextDouble();

        Employee cubillas = new Employee(name, rate, hours);

        cubillas.calculateRegularPay();
        cubillas.calculateOvertimePay();
        cubillas.calculateSalary();
        cubillas.displayEmployeeInfo();

        scanner.close();
    }
}
