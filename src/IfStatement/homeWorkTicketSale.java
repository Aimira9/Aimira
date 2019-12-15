package IfStatement;

import java.util.Scanner;

public class homeWorkTicketSale {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter class name ? Class A ,Class B ,Class C ");

        String name = input.nextLine();

        if (name.equalsIgnoreCase("Class C")) {

            System.out.println("Please enter price between $50 and $70");

            double priceC = input.nextDouble();

            if (priceC >= 50 && priceC <=70) {

                System.out.println("Column D ,row 19");

            } else if (priceC < 50) {
                double columnPrice = 50;
                double rest = columnPrice - priceC;
                System.out.println("You have entered " + priceC + "Please enter the rest of the amount" + rest);

                double correctAmmount = input.nextDouble();
                if (correctAmmount == rest) {
                    System.out.println("Your column D and row 19");
                } else if (correctAmmount != rest) {

                    System.out.println("Your session is completed please return beginning");
                }


            } else if (priceC > 70) {
                System.out.println("Your session is completed please return beginning");


            }


        } else if (name.equalsIgnoreCase("Class B")) {

            System.out.println("Please enter price between $70 and $90 ");

            double priceB = input.nextDouble();

            if (priceB >= 70 && priceB <= 90) {

                System.out.println("Column C ,row 10");
            } else if (priceB < 70) {
                double columnPrice = 90;
                double rest = columnPrice - priceB;
                System.out.println("You have entered " + priceB + "Please enter the rest of the amount" + rest);

                double correctAmmount = input.nextDouble();
                if (correctAmmount == rest) {
                    System.out.println("Your column C and row 10");
                } else if (correctAmmount != rest) ;
                System.out.println("Your session is completed please return beginning");

            }
        } else if (name.equalsIgnoreCase("Class A")) {

            System.out.println("Please enter price between $90 and $110");

            double priceA = input.nextDouble();

            if (priceA >=90 && priceA <=110) {


                System.out.println("Column A ,row 5");

            } else if (priceA < 90) {
                double columnPrice = 110;
                double rest = columnPrice - priceA;
                System.out.println("You have entered " + priceA + "Please enter the rest of the amount" + rest);

                double correctAmmount = input.nextDouble();
                if (correctAmmount == rest) {
                    System.out.println("Your column A and row 5");
                } else if (correctAmmount != rest) ;
                System.out.println("Your session is completed please return beginning");


            }else if (priceA>110) {
                System.out.println("Incorrect ammount");
            }
        }
    }
}

