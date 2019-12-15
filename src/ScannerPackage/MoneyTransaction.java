package ScannerPackage;

import java.util.Scanner;

public class MoneyTransaction {

    public static void main(String[] args) {

        //insert  three times different amount of money ---> the amounts 500,1000,1500
        //i bought phone and i spent 750
        //I bought used computer and i spent 350
        //calculate how much money I have in my saving account

        Scanner input=new Scanner (System.in);

        System.out.println("Please give me the first amount ");
        double first=input.nextDouble();

        System.out.println("Please give me the second amount ");
        double second=input.nextDouble();

        System.out.println("Please give me the third amount ");
        double third=input.nextDouble();

        double totalSaving=first+second+third;
        System.out.println("Total saving is " +totalSaving);

        System.out.println("Please enter price for Phone ");
        double phonePrice= input.nextDouble();

        System.out.println("Please enter price for computer ");
        double computerPrice=input.nextDouble();

        double totalSpending=phonePrice+computerPrice;
        System.out.println("Total spending is " +totalSpending);


        double leftAmount=totalSaving-totalSpending;
        System.out.println("The amount left is " +leftAmount);














    }
}
