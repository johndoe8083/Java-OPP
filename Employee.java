public class Employee {
    private String name;
    private double rate;
    private double hours;
    private double salary;

    public Employee(String name, double rate, double hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double calculateRegularPay(){
        if(hours <= 40){
            return salary = rate * hours;
        } else {
            return salary = rate * 40;
        }
    }

    public double calculateOvertimePay(){
        if(hours > 40){
            return salary = (hours - 40) * rate * 1.5;
        } else {
            return 0;
        }
    }

    public double calculateSalary(){
        return calculateRegularPay() + calculateOvertimePay();
    }

    public void displayEmployeeInfo(){
        System.out.println("Employee name: " + name);
        System.out.println("Employee rate: " + rate);
        System.out.println("Employee hours: " + hours);
        System.out.printf("Employee salary: %.2f%n", calculateSalary());
        System.out.printf("Employee regular: %.2f%n", calculateRegularPay());
        System.out.printf("Employee overtime: %.2f%n", calculateOvertimePay());
    }
}
