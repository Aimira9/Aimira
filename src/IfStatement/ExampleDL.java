package IfStatement;

import java.util.Scanner;

public class ExampleDL {

    public static void main(String[] args) {

        //Driver license example
        //age more than or equals 16
        //Exam score more than or equals 70
        //state ID
        //Driving practise should pass
        //thhis conditions is true you can get driver license
        //this conditions is false you can not get the driver license


        Scanner input=new Scanner (System.in);

        System.out.println("What is your age ? ");

        int age=input.nextInt();

        System.out.println("What is your exam result ?");

        int exam=input.nextInt();

        System.out.println("Do you have a state id?");
        boolean stateID =input.nextBoolean();

        System.out.println("Did you pass the driving practice?");
        boolean drivingPractise=input.nextBoolean();

        if(age>=16 && exam >=70 && stateID==true && drivingPractise==true) {
            System.out.println("You can get driver license");} else{
            System.out.println("You can not get driver license");
        }
    }
}
