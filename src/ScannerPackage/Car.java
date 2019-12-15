package ScannerPackage;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);

        System.out.println("How much do you have? ");

        double currentSaving =input.nextDouble();

        System.out.println ("How much is the car? ");


        double carPrice=input.nextDouble();

        double differences =carPrice-currentSaving;
        boolean canBuy=currentSaving>=carPrice;

        System.out.println("Difference between current saving and car price is " +differences);

        System.out.println("Can I buy the car ?" +canBuy);




        System.out.println("Where are you live?");
        // for string input.next()-->if you are entering only one value
        //if you need to enter more than one string you need to use input.nextLine();


        String city=input.next();

        System.out.println("My current city is" +city);



    }


}
