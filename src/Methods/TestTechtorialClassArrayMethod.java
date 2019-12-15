package Methods;

import java.util.Scanner;

public class TestTechtorialClassArrayMethod {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        ArrayMethod arrayMethod=new ArrayMethod();

        for(int i=0;i<arrayMethod.students.length;i++) {

            System.out.println("What is your name ? ");
            arrayMethod.studentName = input.next();
            arrayMethod.addStudent();
        }
        System.out.println("----------------");

        arrayMethod.printNames();

    }
}
