class Student{
    String name;
    double[] grades;
    static int[] credits = {3,2,1,2,3};
    int totalCredit = 11 ;
    double cgpa;
    Student(String name , double[] number){
        this.name = name ;
        this.grades = new double[5];
        for(int i = 0 ; i < 5 ; i++){
            grades[i] = number[i];
        }
    }
    public double calculateCgpa(){
        double totalMarks = 0 ; 
        for(int i = 0 ; i < 5 ; i++){
            totalMarks+=grades[i]*credits[i];
        }

        return (totalMarks/totalCredit);
    }
    public void displayCgpa(){
        System.out.println("cgpa of "+name+":"+calculateCgpa());
    }
}
public class CGPA {
    public static void main(String[] args) {
        String[] names = {"Dipto", "Alex", "John", "Mike", "Emma"};
        double[][] grades = {
            {3.5, 4.0, 3.8, 3.6, 3.9},
            {3.2, 3.8, 3.7, 3.9, 4.0},
            {3.9, 4.0, 3.6, 3.7, 3.8},
            {4.0, 3.9, 3.8, 3.7, 3.6},
            {3.5, 3.7, 3.8, 3.9, 4.0}
        };

        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            students[i] = new Student(names[i], grades[i]);
        }

        for (Student student : students) {
            student.displayCgpa();
        }
    }
}