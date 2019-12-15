package Arrays1;

import java.util.Arrays;

public class sortString {
    public static void main(String[] args) {

        String[] letters={"b","aa","ab","w","q","c","p"};
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));

        System.out.println(Arrays.binarySearch(letters,"d"));//6==w //start with 0
        //"d" = -5 it should be between c-p  \\\\\"z"== -8
        //if upper case it -1
        //binary search  will loking for what you need
    }
}
