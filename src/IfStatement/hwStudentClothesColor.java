package IfStatement;

import java.util.Scanner;

public class hwStudentClothesColor {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Child's school ?");

        String school = input.nextLine();


        if (school.equalsIgnoreCase("kindergarden")) {
            System.out.println("The clothes is red color");

        }
        else if (school.equalsIgnoreCase("elementary school")) {
            System.out.println("The clothes is blue color");

        }
        else if (school.equalsIgnoreCase("middle school")) {
            System.out.println("Your clothes is white shirt with grey pants ");

        }
        else if (school.equalsIgnoreCase("high school")) {
            System.out.println("Your clothes is blue shirt with blue pants ");

        }
    }
}







