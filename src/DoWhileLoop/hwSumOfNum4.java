package DoWhileLoop;

import java.util.Scanner;

public class hwSumOfNum4 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter 10 numbers ? ");

        int num = 1;
        int num1;
        while (num <= 10) {
            System.out.println("Please enter number ");
           num1=input.nextInt();
           num++;
        }

    }
}
