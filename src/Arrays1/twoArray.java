package Arrays1;

import java.util.Arrays;

public class twoArray {

    public static void main(String[] args) {

        int[]num1={2,3,5,10};//4
        int[]num2={5,1,10}; //3
        //result=2 3 5 10 5 1 -9

        int[]result=new int[num1.length+num2.length]; //4+3=7

        for(int i=0; i<num1.length;i++) {
            result[i]=num1[i];
        }
        for(int i=0;i<num2.length;i++) {
            result[i+num1.length]=num2[i]; //re assigning
        }
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        System.out.println(result[result.length-1]);




    }
}
