package DoWhileLoop;

import java.util.Scanner;

public class TaskNumbers {

    public static void main(String[] args) {


        //print ten numbers between giving ten values
        //giving values differences should more than 10
        //30-45
        Scanner input=new Scanner(System.in);

        int value=30;
        do {
            System.out.println(value);
            value++;

        } while (value<=45);
    }
}
