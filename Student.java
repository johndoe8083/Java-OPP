public class Student {
    private String name;
    private double prelim;
    private double midterm;
    private double finals;
    private double average;
    private String lGrade;

    public Student(String name, double prelim, double midterm, double finals){
        this.name = name;
        this.prelim = prelim;
        this.midterm = midterm;
        this.finals = finals;
    }

    public void displayInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Prelim: " + prelim);
        System.out.println("Midterm: " + midterm);
        System.out.println("Finals: " + finals);

        System.out.println("------------------------------");
    }

    public void letterGrade(String lGrade){
        this.lGrade = lGrade;
        System.out.println(name + " Grade is: " + lGrade);
    }

    public void calculateAverage() {
        average = (prelim + midterm + finals) / 3;
        System.out.println(name + " average is: " + String.format("%.2f", average));
    }

    public void getStatus(){
        if(average >= 75){
            System.out.println("Status: PASS");
        }
        else{
            System.out.println("Status: Failed");
        }
    }
}
