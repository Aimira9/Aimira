package IfStatement;

import java.util.Scanner;

public class CarSpeed {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //using scanner enter 3 different input
        //1-gas pedal  --true/false
        //2-breakPedal ---true/false
        //3-gasPedalPercentage--number
        //4-enter current speed
        //5-enter speed limit

        //IncreaseSpeed =cs<sl,gaspedal equals true
        //gasPedalPercentage more than 20 percent
        //breakPedal should be false


        System.out.println(" Your Current speed limit? ");

        int currentSpeed=input.nextInt();

        System.out.println("Your speed limit? ");

        int speedLimit=input.nextInt();




        System.out.println("Whats your gas pedal? ");
        boolean gasPedal=input.nextBoolean();


        System.out.println("Whats your break pedal ? ");

        boolean breakPedal=input.nextBoolean();

        System.out.println("Provide the gas pedal percentage? ");

        int gasPedalPercentage=input.nextInt();

        boolean increaseSpeed=currentSpeed<speedLimit && gasPedalPercentage>20 &&
                gasPedal==true && breakPedal==false;

        //percentage =20 --> it will stay same speed
        //percentage<20  --> decrease speed
        //percentage >20 --> increase speed

        System.out.println("can i increase the speed ?" +increaseSpeed);





    }
}