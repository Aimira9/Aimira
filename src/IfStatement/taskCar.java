package IfStatement;

import java.util.Scanner;

public class taskCar {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //enter the speed of the car
        //if car speed is more than and equals 1 and less than 20
        //car gear is 1
        //else print gear is not defined or spoeed entered wrong


        System.out.println("Please enter car speed  ?");

        int speed =input.nextInt();

        if (speed>=1 && speed<20 ) {

            System.out.println("Gear is 1 ");
        } else if(speed>=20 && speed<40) {

            System.out.println("Gears is 2");
        }else if (speed>=40 && speed<60) {

            System.out.println("Gear is 3 ");
        } else if(speed>=60 && speed<80) {

            System.out.println("Gear is 4 ");
        } else if(speed>=80 && speed<200) {

            System.out.println("Gear is 5 ");
        } else if(speed<0 && speed>-20) {

            System.out.println("Gear is rear");
        } else {
            System.out.println("Gear is not defined or speed entered wrong");
        }



        //Testing Logic
            //Data==10 --> Expected gear 1 -- Actual Displayed gear 1
        //expected.equalsto(actual);
        //Data == 30 ----Expected gear 2 --Actual Gear 1 -->False --You need to go to the developer
        //Create the BUG
        //You need to test again

        //SCRUM TEAM ---SIT (System Integration Team )--UAT (User Acceptance Team) --  Production Env



    }
}
