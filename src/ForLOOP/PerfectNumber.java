package ForLOOP;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number");
           int num = input.nextInt();
           int sum=0;

            for (int i =1; i<num; i++) {
                if (num % i == 0) {
                    sum=sum+i;//1//1 +2 33 // 3+3= 6

                    //System.out.println(i);
                }
                //System.out.println(sum);

            }
               // 6 = 1 2 3 = 6 //IF ITS EQUAL ITS PERFECT NUMBER
                 // 7 = 1+ 7 =8 //not perfect
                // 8 = 1, 2, 4 = 7
              // 9 = 1, 3, = 4  9=4 -->its not perfect
               //10=1,2,4,5
              // 28 = 1, 2, 4, 7, 14 = 28 ,,,,,28=28 perfect
              //if its not equal its not Perfect NUMBER

            if(sum==num) {

                System.out.println(num + "is perfect number "); //6
            }else{

                System.out.println(num + " is not perfect number");
            }

            //Positive testing
             //once you enter the perfect number result should is perfect number
           //negative testing
           //once you enter the not perfect number ypu should see the is not perfect number
        //scenario
        //give the string and it should not work
    }
}
