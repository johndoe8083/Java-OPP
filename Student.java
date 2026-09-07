public class Student {
    private String name;
    private double prelim;
    private double midterm;
    private double finals;
    private double average;

    public Student(String name, double prelim, double midterm, double finals){
        this.name = name;
        this.prelim = prelim;
        this.midterm = midterm;
        this.finals = finals;
    }

    public double calculateAverage(){
        return (prelim + midterm + finals) / 3;
    }

    public String getstatus(){
        if (calculateAverage() >= 75)
            return "PASSED";
        else
            return "FAILED";
    }

    public String letterGrade(){
        if(calculateAverage() >= 90){
            return "A";
        } else if(calculateAverage() >= 85){
            return "B";
        } else if(calculateAverage() >= 80){
            return "C";
        }else if(calculateAverage() >= 75){
            return "D";
        } else{
            return "F";
        }
    }

    public void displayStudentInfo(){
        System.out.println("Student name: " + name);
        System.out.println("Student prelim: " + prelim);
        System.out.println("Student midterm: " + midterm);
        System.out.println("Student finals: " + finals);
        System.out.printf("Student average: %.2f%n", calculateAverage());
        System.out.println("Status: " + getstatus());
        System.out.println("Grade: " + letterGrade());
    }
}
