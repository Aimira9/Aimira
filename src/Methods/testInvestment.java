package Methods;

import java.util.Scanner;

public class testInvestment {

    public static void main(String[] args) {

        Investment investment=new Investment(); //1 first we give an object

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an amount ");
        investment.amount=input.nextDouble();

        System.out.println("Please enter number of years you want to invest: ");
        investment.years=input.nextDouble();

        System.out.println("Please enter the rate: ");
        investment.rate=input.nextDouble();

        System.out.println("Your total will be " + investment.totalAmount()+" in "+ investment.years+" years !  ");



    }
}
