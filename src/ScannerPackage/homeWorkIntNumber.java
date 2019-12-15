package ScannerPackage;

import java.util.Scanner;

public class homeWorkIntNumber {


    public static void main(String[] args) {



        Scanner input=new Scanner (System.in);

        System.out.println("How much money they are charge for international phone number ? ");

        int number1=input.nextInt();


        System.out.println("How much money they are charge for local number ? ");

        int number2=input.nextInt();


        System.out.println("Deposit is");

        int deposit=input.nextInt();


        int callIntNumber=deposit/number1;

        System.out.println("How many times i can call international number " + callIntNumber);



        int callLocalNum=deposit/number2;

        System.out.println("How many times i can call local numbers "  +callLocalNum);









    }
}
