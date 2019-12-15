package StringPackage;

import java.util.Scanner;

public class StringContains {

    public static void main(String[] args) {

        String name="Techtorial";

        boolean condition =name.startsWith("T"); //we can give more characters

        System.out.println(condition); //true


        boolean condition2=name.endsWith("r");
        System.out.println(condition2);


        boolean condition3=name.contains("ua");

        System.out.println(condition3);

        //Using scanner input your name and check your name contains giving value
        //F- Aimira - //date of birth(1996)
        //check start with F if you are female
        // check input ends with your date of birth

        Scanner input=new Scanner(System.in);

        System.out.println("What is your gender,name and date of birth ? ");

        String name1=input.next();

        boolean gender=name1.startsWith("F"); //true
        System.out.println(gender);

        boolean name2= name1.contains("Ai"); //true
        System.out.println(name2);


        boolean dateOfBirth=name1.contains("96"); //true
        System.out.println(dateOfBirth);

        //first correct values true,true,true
        //all the values are wrong
        //gender is correct,,,, name and date is wrong
        //gender is correct,,, name is wrong and date is correct

        //Student
        //less than 18 or equals 18 --green
        //more than 18 but less 50---red
        // more than 50 year --black







    }
}
