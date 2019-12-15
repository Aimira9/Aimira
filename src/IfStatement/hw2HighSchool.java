package IfStatement;

import java.util.Scanner;

public class hw2HighSchool {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Provide your age please ? ");
        int age=input.nextInt();


        System.out.println("Provide your average score please");
        double averageScore =input.nextDouble();


        System.out.println("Provide your city please ?");
        String city =input.next();
        boolean city1;
        if(city.equalsIgnoreCase("Shaumburg")){
            city1=true;}else{city1=false;}




        System.out.println("Provide your citizenship ");
        String citizenship =input.next();
        boolean citizen;
        if (citizenship.equalsIgnoreCase("US")){
            citizen=true;
        }else{citizen=false;}



        if(age>14 && city1==true  && averageScore>75 && citizen==true){
            System.out.println("Student can attend the classes");}else{
            System.out.println("Student can not attend the classes");
        }





    }
}
