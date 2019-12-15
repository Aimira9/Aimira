package Arrays1;

public class homeWork2 {

    public static void main(String[] args) {




        int[] nums = {1, 2, 3, 5, 11, 9, 0};//length=6
        int sum=0;

        for (int i = 0; i < nums.length; i++) {

            sum+=nums[i];
            //System.out.println(sum);
        }
        System.out.println("Sum of numbers in Array is "+sum);




    }
}