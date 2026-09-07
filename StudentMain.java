import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Prelim: ");
        double prelim = scanner.nextDouble();

        System.out.print("Enter Student Midterm: ");
        double midterm = scanner.nextDouble();

        System.out.print("Enter Student Finals: ");
        double finals = scanner.nextDouble();

        System.out.println("-----------------------------------------------");

        Student cubillas = new Student(name, prelim, midterm, finals);

        cubillas.displayStudentInfo();

        scanner.close();
    }
}
