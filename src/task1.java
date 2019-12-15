import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        //create array of int
        //assign 10 num 0-100
        //print values in reverse
        int[] number = {3, 6, 34, 67, 22, 45, 32, 12, 9, 4};

        for (int i = number.length - 1; i >= 0; i--) {

            System.out.print(number[i] + "  ");

        }

        System.out.println();

        //create arr of int ;assign 10nums
        //print sum of array

            int[] nums = {1, 2, 3, 5, 11, 9, 78,34,21,22}; //186
            int sum=0;
            for (int k = 0; k < nums.length; k++) {
                sum+=nums[k];
            }
            System.out.println("Sum of numbers in Array is "+sum);

            int[] a= {3, 0, 0, 6, 7, 0, 0, 7, 6, 5};
            int size=a.length;
            int b[]=new int[size];
            for(int i=0;i<a.length;i++) {
                if(a[i] !=0) {
                    b[i]=a[i];
                }
                System.out.println(Arrays.toString(b));
            }


        }


    }

