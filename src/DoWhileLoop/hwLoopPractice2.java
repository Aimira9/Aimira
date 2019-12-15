package DoWhileLoop;

import java.util.Scanner;

public class hwLoopPractice2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int num2 = input.nextInt();

        while (num <=num2) {
            if (num % 2 == 0 && num % 7 == 0) {
                System.out.println(num);
            }
            num++;
        }


    }
}



