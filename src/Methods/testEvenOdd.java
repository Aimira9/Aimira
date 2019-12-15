package Methods;

import java.util.Scanner;

public class testEvenOdd {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number ? ");

        int num =input.nextInt();

        EvenOdd EvenOdd =new EvenOdd();
        System.out.println("Your number is even :  " +EvenOdd.isEven(num));
        System.out.println("Your number is odd : " +EvenOdd.isOdd(num));

    }
}
