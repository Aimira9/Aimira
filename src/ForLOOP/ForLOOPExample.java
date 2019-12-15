package ForLOOP;

import java.util.Scanner;

public class ForLOOPExample {

    public static void main(String[] args) {

        for(int i=0; i<10 ; i++) {

            //working of FOR LOOP :
            //it will start with first condition  i=0;
            //then check second condition if its true
            //he will go to sout
            //and after sout he will execute 3rd condition
            //after 3rd condition he will back to 2nd condition if its true
            // he will again execute 3rd condition
            //if this condition is false it will NOT EXECUTED
            //if false it will not FALSE

            //i , k  ,l

            System.out.println(i);
        }

        for (int i =1 ;i<=5;i++) {
            System.out.println("AIMIRA");
        }

        for (int i=9 ; i>0 ; i--) {

            System.out.println(i);
        }

        //enter the number (5times)

        Scanner input=new Scanner(System.in);
        int number;
        int sum=0;

        for(int i=0;i<5;i++) {

            System.out.println("Please enter the numbers ");
            number=input.nextInt();
            sum=sum+number;
        }

        System.out.println(sum);

        int x=0;
        for (int i =5;i<9 ;i++) {
            x=i*i*i;
            System.out.println(x);
        }




















    }
}
