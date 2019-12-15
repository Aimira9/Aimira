package IfStatement;

import java.util.Scanner;

public class NestedIFStatement {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Do you have a password ?");

        boolean passport=input.nextBoolean();

        if (passport) {

            System.out.println("Do you have a ticket ? ");

            boolean ticket = input.nextBoolean(); //false

            if (ticket) {

                System.out.println("YOU CAN COME TO USA");
            } else {

                System.out.println("you can not come to USA");

            }
        }
    }
}
