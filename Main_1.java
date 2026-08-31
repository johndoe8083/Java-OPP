public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Riel Jan", 00406, "IT department", 25000);
        Employee emp2 = new Employee("Cubillas", 00407, "IT department", 30000);

        emp1.displayInfo();
        emp2.displayInfo();

        emp1.SalaryRaise(3000.00);
        emp2.SalaryRaise(2500.00);
    }
}
