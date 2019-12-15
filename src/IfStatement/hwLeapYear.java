package IfStatement;

import java.util.Scanner;

public class hwLeapYear {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println(" please enter the year ? ");
        //byte 127-128
        //short %int=int
        //short/short=int

        int year=input.nextInt();



        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println("It is leap year");}else{
            System.out.println("It is not leap year");
            // System.out.println("It is not leap year"); --always will be executed

            //if its true
            //it is leap year -->1 line from if
            //it is not leap year -->2 line from else
            //if it is false
            //"It is not leap year"
            // "It is not leap year"



        }



    }
}
