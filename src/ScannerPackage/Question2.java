package ScannerPackage;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Please provide the length");

        double lenght =input.nextDouble();

        System.out.println("Please provide the width");

        double width = input.nextDouble();

        int area=(int)(lenght*width);

        System.out.println("Area of the rectangle is" +area);




    }
}
