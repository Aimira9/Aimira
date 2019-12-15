package GroceryStore;

import java.util.Scanner;

public class CheckOut {

    Scanner inputs=new Scanner(System.in);

    public String paymentOption(String payment){

        System.out.println("please select payment option:Credit card/Debit/Bitcoin/ PayPal");
        String option = inputs.nextLine();

        return option;

    }
}
