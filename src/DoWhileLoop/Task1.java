package DoWhileLoop;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        int first = input.nextInt();
        int second = input.nextInt();

        while (first>=second) {

            System.out.println(first);
            first--;
        }
    }
}
