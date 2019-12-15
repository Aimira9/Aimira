package DoWhileLoop;

import java.util.Scanner;

public class TaskSTAR {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num = 5;
        String star = "*";

        //System.out.println("please enter the number");
        //int num1=input.nextInt(); //error.InputMismatchException
        //++,-- only works with primitive number

        do {
            System.out.println(star);
            star=star+"*"; //star+=star+"*";--bug
            num--;

        } while (num>0);


    }






}
