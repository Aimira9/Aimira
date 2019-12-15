package Methods;

import java.util.Scanner;

public class testProfitCalcStore {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the quantity ? ");
        int quantity=input.nextInt();

        System.out.println("Please enter the price ? ");
        int price=input.nextInt();

        ProfitCalculator pc=new ProfitCalculator();// we need give a object

        if(quantity<20) {

            System.out.println(pc.sell(price,quantity));
            System.out.println("There is no discount , if u want it,buy more 20 or more");
        }else if(quantity>=20 && quantity<40) {

            System.out.println(pc.sell10dis(price,quantity));
            System.out.println("Includes 10% ");
        }else if(quantity>=40) {
            System.out.println(pc.sell20dis(price,quantity));
            System.out.println("Includes 20 %");
        }else {
            System.out.println("your quantity is invalid ");
        }


    }
}
