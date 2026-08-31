public class Employee {
    String name;
    int employeeId;
    String department;
    double salary;

    public Employee(String name, int employeeId, String department, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Enter employee name: " + name);
        System.out.println("Enter employeeID: " + employeeId);
        System.out.println("Enter your department: " + department);
        System.out.println("Enter your salary: " + salary);
        System.out.println("------------------------------");
    }

    public void SalaryRaise(double amount){
        salary += amount;
        System.out.println(name + " 's new salary is: $" + salary);
    }
}
