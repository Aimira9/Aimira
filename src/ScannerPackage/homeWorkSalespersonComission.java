package ScannerPackage;

import java.util.Scanner;

public class homeWorkSalespersonComission {
    public static void main(String[] args) {


        Scanner input=new Scanner (System.in);

        System.out.println("How much total sales worth ?");

        int totalsales=input.nextInt();

        System.out.println("How much % comission rate?");

        int comissionRate=input.nextInt();

        int comissionPayment=totalsales*comissionRate/100;

        System.out.println("How much your comission payment ?" +comissionPayment);


















    }
}
