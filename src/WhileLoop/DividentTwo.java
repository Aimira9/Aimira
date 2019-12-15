package WhileLoop;

import java.util.Scanner;

public class DividentTwo {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the number ");

        //TasK
        //18/2=9
        // 9/2=4
        //4/2=2
        //2/2 =1
        //1/2=0
        //divident of 18 = 9+4+2+1+0=16!!!!

        //loop
        int num=input.nextInt();
        int count=0;

        while (num>0) {
            num= num/2;
            count=count+num;

        }
        System.out.println(count);
    }



}
