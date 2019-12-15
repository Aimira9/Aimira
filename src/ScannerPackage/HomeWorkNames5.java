package ScannerPackage;

import java.util.Scanner;

public class HomeWorkNames5 {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);

        System.out.println("Please provide five full names ");

        String name1=input.nextLine();
        String name2=input.nextLine();
        String name3=input.nextLine();
        String name4=input.nextLine();
        String name5=input.nextLine();
        System.out.println("Five full names " + name1 + " and " + name2 + " and" + name3 +" and " +name4 +" and " + name5 );

    }
}
