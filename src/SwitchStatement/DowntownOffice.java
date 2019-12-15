package SwitchStatement;

import java.util.Scanner;

public class DowntownOffice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //office 50 floor
        //30th fl there are 3 companies (walgreens,cvs,discover)
        //31 th ,there r 2companies (Techtorial,bluecross)

        //total number of elevator is 6
        //Elevator:Which floor do u wanna go
        //Second question Which company you wanna go

        //Walgreen -1
        //CVS -2


        System.out.println("Which floor do you wanna go ? 30,31 ? ");
        int floor = input.nextInt();


        switch (floor) {

            case 30:
                System.out.println("There are 3 companies : Walgreens, Cvs , Discover ");
                String company=input.next();


            switch (company) {

                case "Walgreens":
                    System.out.println("Walgreen-Elevator 1");
                    break;

                case "CVS":

                    System.out.println("CVS-Elevator 2");
                    break;

                case "Discover":
                    System.out.println("Discover -Elevator 3");
                    break;
            }
            break;

                case 31:

                    System.out.println("There are 2 companies : Techtorial , Bluecross ");
                    String company1 = input.next();


                    switch (company1) {


                case "Techtorial":
                    System.out.println("Techtorial -Elevator 4");
                    break;

                case "BlueCross":
                    System.out.println("BlueCross -Elevator 5");
                    break;
                default:
                    System.out.println("Its not matching");
                    break;


            }
        }
    }
}
