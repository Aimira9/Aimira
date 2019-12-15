package IfStatement;

import java.util.Scanner;

public class FalcaoCame {

    public static void main(String[] args) {

        //first Galatasaray should pay 3mil to the Club
        //Gal should pay 5mil to falco

//        Scanner input=new Scanner(System.in);
//
//        System.out.println("Please enter the Galatasaray Budget");
//
//        int galBudget=input.nextInt();
//
//        System.out.println("Please enter Player Salary");
//        int playerSal=input.nextInt();
//        if(galBudget==3000000 && playerSal==5000000) {
//
//            System.out.println("Falcao can come to the Galatasaray");
//        }else {
//
//            System.out.println("Falcao can not come to the Galatasaray");
//        }




        //Microphone from amazon
        //using scanner you need input the star,review number,price mic
        //4star,more 100 review,price should be less 20$
        //if your condition is true print i can buy the TONOR mic
        //else print i Can not buy the tonor


        Scanner sc=new Scanner(System.in);

        System.out.println("How many stars? ");
        int star=sc.nextInt();

        System.out.println("What's the review?");
        int review=sc.nextInt();

        System.out.println("What's the price ?");
        int price=sc.nextInt();

        if (star>=4 && review>100 && price<=20) {
            System.out.println("I can buy the microphone");
            System.out.println("the price for product" +price);

        }else {
            System.out.println("I can not buy the microphone"); }



    }

}
