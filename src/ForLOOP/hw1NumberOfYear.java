package ForLOOP;

import java.util.Scanner;

public class hw1NumberOfYear {
    public static void main(String[] args) {

        // the user enter the number of year from the console.
        // Considering one sprint is 2 week in the company.
        // write the program to find total sprint within entered year.
        // and print number of sprint at the end


        Scanner input=new Scanner(System.in);

        int year=input.nextInt();
        int oneSprint=(year*48)/2; //1year=48weeks

        for(int i=1;i<=oneSprint; i++){

            System.out.println(i+"Sprint");

        }
        System.out.println("Total sprint is " +oneSprint);

























    }
}
