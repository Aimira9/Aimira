package DoWhileLoop;

import java.util.Scanner;

public class homeWorkNumofTimes {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of times ");

        int times=input.nextInt();

        while (times>0) {

            System.out.println("********");
            times--;


        }



    }
}
