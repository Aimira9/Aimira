package SwitchStatement;

import java.util.Scanner;

public class PracticeStrawberry {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //using scanner give the string values
        //strawberry,cranberry,chocolate,banana
        //if switch will match with the values print matching value
        System.out.println("Please enter the value ");
        String berry=input.next();
        switch (berry) {
            case "strawberry":

                System.out.println("Matching value is" +berry);
                break;
            case "cranberry":

                System.out.println("Matching value is" +berry);
                break;
            case "chocolate":

                System.out.println("Matching value is" +berry);
                break;
            case "banana":
                System.out.println("Matching value is" +berry);
                break;
            default:
                System.out.println("Value is not matching");
                break;


        }
    }
}
