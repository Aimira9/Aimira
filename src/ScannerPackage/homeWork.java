package ScannerPackage;

import java.util.Scanner;

public class homeWork {

    public static void main(String[] args) {


        double l  =60;

        double b=50;

        int total = (int)(l+b);
        System.out.println("The size is " +total);


        Scanner input=new Scanner(System.in);
        System.out.println( "What's the length of the rectangle? " );

        double rectangleLenght=input.nextDouble();
        System.out.println("What's the breadth of the rectangle ? ");



            double rectangleBreadth=input.nextDouble();


            boolean differences=l>=b;// false
        boolean differences1= l<b;// true

        System.out.println("Differences between sizes " +differences);
        System.out.println("Differences between sizes " +differences1);
























    }
}
