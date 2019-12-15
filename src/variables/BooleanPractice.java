package variables;

public class BooleanPractice {


    public static void main(String[] args) {

        boolean isLightOn=true;
         isLightOn=false;

         isLightOn=!false;

        System.out.println(isLightOn);

        //= for assignment
        // == for compare the values

        int currentSpeed=60;
        int speedLimit=50;
        boolean increaseSpeed=currentSpeed<speedLimit; //true
        boolean decreaseSpeed=currentSpeed>speedLimit; //false

        System.out.println("Increase speed is " +increaseSpeed);
        System.out.println("Decrease speed is " +decreaseSpeed);

        //average temperature for the room 72F
        //if currentTemperature is less than 72F increase
        //current temperature is more 72F decrease

        int currentTemp=60;
        int averageTemp=72;

        boolean increaseTem=currentTemp<averageTemp;  //60<72
        boolean decreaseTemp=currentTemp>averageTemp; //60>72
        System.out.println("Increase temp is " +increaseTem);
        System.out.println("Decrease temp is " +decreaseTemp);

        //Sell the alcohol if person age is more or equals to 21
        //don't sell alcohol if person age is less than 21

        int personAge=18;
        int legalAge=21;

        boolean sellAlcohol=personAge>=legalAge; //18>=21;false
        boolean dontSellAlcohol=personAge<legalAge; //18<21;true
        System.out.println("Sell the alcohol " +sellAlcohol);
        System.out.println("Don't sell the alcohol "+dontSellAlcohol);

        int homePrice=500_000;
        int currentMoney=620_000;

        boolean buyHouse=currentMoney>=homePrice; //0>=500000
        boolean dontBuyHouse=currentMoney<homePrice; //0<500000

        System.out.println("Buy house if you have " +buyHouse);
        System.out.println("Don't buy house if you don't have " +dontBuyHouse);



    }
}
