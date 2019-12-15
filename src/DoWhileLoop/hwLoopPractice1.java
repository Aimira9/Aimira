package DoWhileLoop;

import java.util.Scanner;

public class hwLoopPractice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        do {
            System.out.println(num1);
            num1++;

        } while (num1<=num2 );
        }
    }
