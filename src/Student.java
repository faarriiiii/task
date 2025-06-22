import java.util.*;

public class Student {
    String name;
    int rollNumber;
    double[] marks;

    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;

    }

    public double getAverageMarks() {
        double sum = 0;
        for (double mark : marks) {
            sum = mark + sum;
        }
        return sum / marks.length;

    }
    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "roll Number: " + rollNumber + "\n" +
                "marks: " + Arrays.toString(marks);
    }

}