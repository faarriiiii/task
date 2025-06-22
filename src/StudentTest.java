import java.util.*;
public class StudentTest {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("enter the number of students : ");
        int num = c.nextInt(); // 4
        c.nextLine();

        for (int i = 0; i < num; i++) {

            System.out.println("enter student name : ");
            String name = c.nextLine();


            double[] marks = new double[3];
            System.out.println("enter 3 marks: ");
            for (int j = 0; j < 3; j++) {
                marks[j] = c.nextDouble();
            }
            c.nextLine();

            int grollNumber = StudentIdGenerator.generateStudentId();
            System.out.println("Generated Roll Number: " + grollNumber);

            Student student = new Student(name, grollNumber, marks);
            students.add(student);

            System.out.println("\nStudent Details:");
            System.out.println(student);
            System.out.println();


        }
    }
}