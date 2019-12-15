package IfStatement;

import java.util.Scanner;

public class taskGradeA {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //Grade A
        //Using scanner enter average score
        //once you enter average score you need to print the grade for average score

        //>=80-100 Grade A
        // >=60-80 Grade b
        // >=40-60 Grade c
        // >=20-40 Grade d
        // >=0-20 Grade f

        System.out.println("Please enter average score  ?");

        int averageScore =input.nextInt();

        if (averageScore>=80 && averageScore<100 ) {

            System.out.println("Grade A ");
        }else if (averageScore>=60 && averageScore<80) {

            System.out.println("Grade B ");
        } else if(averageScore>=40 && averageScore<60) {

            System.out.println("Grade C ");
        } else if(averageScore>=20 && averageScore<40) {

            System.out.println("Grade D ");
        } else if(averageScore>=0 && averageScore<20) {

        }else {
            System.out.println("Score is not defined");
        }
    }
}
