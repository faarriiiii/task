import java.util.*;

public class StudentIdGenerator {


    private StudentIdGenerator() {

    }


    public static int generateStudentId() {
        return (int)(Math.random() * 900) + 100;


        //(int)(Math.random() * (max - min + 1)) + min;
    }

}
