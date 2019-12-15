package Arrays1;

import java.util.Arrays;

public class arraysPractice {

    public static void main(String[] args) {

        int[]numbers=new int[5]; //size of this int =5

        numbers[0]=1; //arrays always start with 0
        numbers[1]=5;
        numbers[2]=10;
        numbers[3]=15;
        numbers[4]=20; //randomly numbers

        //automotically give us a zero 0
        //numbers[3]=15;
        //numbers[4]=20; -->exception

        System.out.println(Arrays.toString(numbers));


        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers.length); //length return me to size of my array


        System.out.println("************");

        for (int i =0;i<numbers.length;i++) {
            //length= 0 1  2  3   4
            //        1 5 10 15   20

            System.out.println(numbers[i]); //we give index of i






















        }


    }
}
