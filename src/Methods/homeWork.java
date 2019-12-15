package Methods;

import java.util.Arrays;

public class homeWork {

    public int[] homework(int[] arr) {
        int[] result=new int[3];

            Arrays.sort(arr);
            result[0]=arr[0]; //min

            result[1]=arr[arr.length-1]; //max
            int sum=0;
            //{5,2,3,10}->20/4=5
            for(int i=0;i<arr.length;i++) {
                sum=sum+arr[i];
            }
            int average=sum/arr.length;

            result[2]=average; //average

            return result;
    }

    }


