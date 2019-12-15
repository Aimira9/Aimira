package IfStatement;

import java.util.Scanner;

public class BankOfAmerica {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the username ");

        String username=input.next();
        //username
        //password
        //captcha

        if (username.equals("aimira")){

            System.out.println("Please enter the password ");


            String password=input.next();


            if (password.equals("DesPlaines21")) {

                System.out.println("Please enter a captcha ");

                String captcha=input.next();

                if (captcha.equals("beam")) {

                    System.out.println("Welcome to Bank of America ");
                }else {

                    System.out.println("Catcha is wrong ");
                }


            } else {
                System.out.println("Password is wrong");
            }


        }else{
            System.out.println("Username is wrong ");


        }
    }
}
