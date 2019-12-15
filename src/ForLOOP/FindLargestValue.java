package ForLOOP;

import java.util.Scanner;

public class FindLargestValue {

    public static void main(String[] args) {

        //using scanner i will ask user to enter the number
        //4
        //4times enter the number
        //5-first
        // 10-second (first)
        // 8 4
        //find the largest number and print


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the total number");
        int totalNum = input.nextInt(); //6

        System.out.println("Please enter number " + totalNum + " times");
        int firstNum = input.nextInt();
        for (int i =0; i<totalNum - 1; i++) {
            //this loop needs to run 5 times

            int secondNum = input.nextInt();

            if (secondNum > firstNum) {

                firstNum = secondNum;
            }



        }
        System.out.println(firstNum);
        //find the smallest number


    }





}
