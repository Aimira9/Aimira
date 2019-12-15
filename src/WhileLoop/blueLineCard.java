package WhileLoop;

import java.util.Scanner;

public class blueLineCard {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        //card 35
        //every ride is 2
        //how many times i can use my card
        //everytime print
        //1-card used
        // 2-card used

        int card=input.nextInt();

        int count=1;

        while (card>=2) {

            card= card-2;
            System.out.println(count + "I can use my card ");
            count++;
        }


    }
}
