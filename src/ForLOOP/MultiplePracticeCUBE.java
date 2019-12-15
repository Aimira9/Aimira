package ForLOOP;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MultiplePracticeCUBE {

    public static void main(String[] args) {

        int x = 0;
        for (int i = 5; i <= 9; i++) {
            x = i * i * i;
            System.out.println(x); //5*5*5 , 6*6*6 ,,7*7*7,,8*8*8,,9*9*9
            //sout(i*i*i)
        }
        //using scanner please enter the number
        //28 ----1 2 4 7 14 28
        // using for loop print entered number dividers


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number ");

        int num = input.nextInt();

        for (int i = 1; i <= 28; i++) {
            if (28 % i == 0) {
                System.out.println(i);
            }


        }
        //using scanner i will enter the number ; 5!
        //5*4*3*2*1
        //find the factorial value of the number ;

        System.out.println("Please enter the NUM");
        int number = input.nextInt();
        int factorial=1;

        for (int i =number; i>=1; i--) {
            //System.out.println(i);
            factorial = factorial * i; //14*13*12*11*10....
        }
        System.out.println(factorial);




    }
}
