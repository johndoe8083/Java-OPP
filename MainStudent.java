public class MainStudent {
    public static void main(String[] args){
        Student cubillas = new Student("Riel Jan", 70, 80, 90);
        Student obatay = new Student("John doe", 75, 87, 95);

        cubillas.displayInfo();
        obatay.displayInfo();

        cubillas.letterGrade("A");
        obatay.letterGrade("B");
        System.out.println("");

        cubillas.calculateAverage();
        cubillas.getStatus();

        obatay.calculateAverage();
        obatay.getStatus();
    }
}
