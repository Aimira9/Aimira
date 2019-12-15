package DoWhileLoop;

import java.util.Scanner;

public class HomeWorkUpdates {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of the dates ? ");

        int num=input.nextInt();
        num=num/15;

        do {
            System.out.println( num + " Updates Available" );
            num--;

        } while (num>0);
    }
}
