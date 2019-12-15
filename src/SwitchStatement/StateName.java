package SwitchStatement;

import java.util.Scanner;

public class StateName {

    public static void main(String[] args) {

        //using scanner ask the user the state name
        //illinois ,florida
        //state is not available
        //if your input is matching one of the state then ask the second question

        //please enter your city name

        //illinois
        //chicago
        //elgin
        //des plaines

        //florida
        //miami
        //tampa
        //jacksonville

        Scanner input = new Scanner(System.in);

        System.out.println("Please Provide your state ? Illinois ,Florida ");

        String state = input.next();

        System.out.println("Provide your city ");
        String city = input.next();

        switch (state) {


            case "illinois":

                System.out.println("Enter the city name :Chicago, Elgin, Jacksonville");



                   switch (city) {

                    case "Chicago":
                        System.out.println("The have selected the organization in" + state + city);
                      break;

                    case "Elgin":
                        System.out.println("The have selected the organization in" + state + city);
                       break;
                    case "Des Plaines":
                        System.out.println("The have selected the organization in" + state + city);
                        break;


                }

                break;


            case "Florida":


                switch (city) {



                    case "Miami":
                        System.out.println("The have selected the organization in " + state + city);
                        break;

                    case "Tampa":
                        System.out.println("The have selected the organization in " + state + city);
                        break;

                    case "Jacksonville":
                        System.out.println("The have selected the organization in " + state + city);
                        break;
                }

            default:
                System.out.println("State is not available");
                break;

        }
    }
}