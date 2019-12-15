package ForLOOP;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the NUMBER");
        int number = input.nextInt();
        int factorial=1;

        for (int i =number; i>=1; i--) {
            //System.out.println(i);
            factorial = factorial * i; //14*13*12*11*10....
        }
        System.out.println(factorial);
    }
}
