package Exceptions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RuntimeEx {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 4};

        System.out.println(numbers[2]); //4

        try {
            System.out.println(numbers[3]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("this code throw exception");
        }

        System.out.println(numbers[1]); //3

        //Arithmetic Exception

        Scanner input = new Scanner(System.in);
        System.out.println("hey enter two numbers you want to divide ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("you can NOT  divide by zero ");
            System.out.println(e.getMessage()); //it will print message of exception  //it will print :/ by zero
            System.out.println(e.getStackTrace()); //it will print object code
            e.printStackTrace(); //it will give us what kind of exception is it
        }
        System.out.println("your code is finished ");


        String name = null;
        try {
            name.toUpperCase();
        }catch (NullPointerException e) {
            System.out.println("it is an exception ");
        }

    }

}
