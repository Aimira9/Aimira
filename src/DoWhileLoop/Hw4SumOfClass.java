package DoWhileLoop;

import java.util.Scanner;

public class Hw4SumOfClass {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int sum = input.nextInt();
        int sum1 = input.nextInt();
        int sum2=0;

        while (sum <= sum1) {

            System.out.println(sum);
            sum2=sum2+sum;
            sum++;
        }

        System.out.println("The sum of this number "+sum2);

        //Debugging.It is very important!!!
    }
}