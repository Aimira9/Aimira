package IfStatement;

import java.util.Scanner;

public class BestBuy {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);

        System.out.println("Please write price for phone");

        double price=input.nextDouble();

        if(price >=1000) {

            System.out.println("You can buy the phone");

        }else if (price<1000) {

            double rest = 1000 - price;

            System.out.println("rest of money" + rest);

            //how do you handle the stress?
            //priority to work
            //i can divide the my job to the part
            //all of them part by part
        }



    }
}
