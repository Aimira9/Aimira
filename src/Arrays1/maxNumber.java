package Arrays1;


import java.util.Arrays;

public class maxNumber {

    public static void main(String[] args) {

        int[] number={3,6,101,2,56,0,-10};
        System.out.println(Arrays.toString(number)); //[3, 6, 101, 2, 56, 0, -10] repeat

        Arrays.sort(number);
        System.out.println(Arrays.toString(number)); //[-10, 0, 2, 3, 6, 56, 101]

        System.out.println(number[number.length-1]); //max number -- 101

        System.out.println(number[0]); //min number -10

        System.out.println(number[number.length/2]); //6/2=3 ,,,, 0 1 2 3====6  //7/2=3


    }
}
