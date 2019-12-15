package ScannerPackage;

import java.util.Scanner;

public class homeWorkPen {

    public static void main(String[] args) {


        Scanner input=new Scanner (System.in);

        //pen costs 50$ and its been sold at a discount of 12%,what is the discount price ot the pen?

        System.out.println("Please give me the price of the pen ");

        int price1=input.nextInt();

        System.out.println("Please give me the discount amount ");

        int discount1=input.nextInt();

        int discount2=price1*discount1/100;

        System.out.println("The discount is $" +discount2);

        int discountPrice =price1-discount2;
        System.out.println("the price of the pen is $" +discountPrice);














    }
}
