package SwitchStatement;

import java.util.Scanner;

public class SwitchPractice {

    public static void main(String[] args) {

        //Write the code to print out the name of the days
        //0-sunday
        //1-monday
        //2-tuesday
        //3-wednesday
        //4-thursday
        //5-friday
        //6-saturday

        Scanner input=new Scanner(System.in);

        int dayNum=input.nextInt();
        switch (dayNum){

            case 0:

                System.out.println("Sunday");
                break;
            case 1:

                System.out.println("Monday");
                break;
            case 2:

                System.out.println("tuesday");
                break;
            case 3:

                System.out.println("Wednesday");
                break;
            case 4:

                System.out.println("Thursday");
                break;
            case 5:

                System.out.println("Friday");
                break;
            case 6:

                System.out.println("Saturday");
                break;
            default:
                System.out.println("The value is not matching with any case statement");
                break;
        }

    }
}
