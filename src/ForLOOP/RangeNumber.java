package ForLOOP;

import java.util.Scanner;

public class RangeNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        if (num>=18 && num<=40) {

            System.out.println(num + " In the range");

            for(int i=num;i<=40;i++) {

                System.out.println(i);


            }
        }else{
            System.out.println(num+"is not in the range");
        }


        //1-the number is in the range or not (give the number between 10 to 40)
        //2-the number is not in the range (give the number out of 10-40)
        //3-upper limit 40,lower limit 10


    }
}
