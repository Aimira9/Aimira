package SwitchStatement;

import java.util.Scanner;

public class SwitchStudent {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter student number ");
        int studentNum=input.nextInt();

        switch (studentNum) {

            case 123:

                System.out.println("Arslan");
                break;
            case 236:
                System.out.println("Muammer");
            case 250:
                System.out.println("Tima");
                break;
            default:
                System.out.println("Student is not available");
                break;
        }

    }
}
