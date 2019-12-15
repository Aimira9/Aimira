package IfStatement;

import java.util.Scanner;

public class hw3ShoppingApplication {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter number of Tomatoes ");
        int tomatoes=input.nextInt();

        System.out.println("Please enter number of Cucumber ");
        int cucumber=input.nextInt();

        System.out.println("Please enter number of Carrot ");
        int carrot=input.nextInt();

        System.out.println("Please enter number of Eggplant ");
        int eggplant=input.nextInt();

        int tomatoPrice=tomatoes*1;
        double cucumberPrice=cucumber*0.50;
        double carrotPrice=carrot*0.25;
        int eggplantPrice=eggplant*2;

        double total=tomatoPrice+cucumberPrice+carrotPrice+eggplantPrice;
        System.out.println("Total you need to pay" +total);


        double discountPrice=total*10/100;
        double discountPr=total-discountPrice;


        if(total>10){
            System.out.println("You need to pay $ "+discountPr);
        }

        if(total<10){
            System.out.println("Don't apply any discount");
        }




    }
}
