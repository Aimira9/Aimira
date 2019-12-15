package Arrays1;

public class multiDimens {
    public static void main(String[] args) {

        int[][][] nums={{{5,6},   {8}},  {{1},  {3,4,0}},   {{22}}};

        System.out.println(nums[2][0][0]);
        System.out.println(nums[1][1][1]);
        System.out.println(nums[0][1][0]);

        System.out.println("------------");

        for(int[][] aimira1:nums) {
            for(int[]kira1:aimira1){
                for(int kubat:kira1) {

                    System.out.println(kubat);
                }
            }
        }
    }
}
