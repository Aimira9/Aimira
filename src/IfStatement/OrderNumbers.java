package IfStatement;

import java.util.Scanner;

public class OrderNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter four numbers ");



        int one=input.nextInt();
        int two=input.nextInt();
        int three=input.nextInt();
        int four=input.nextInt();

        if(one>two) {

            int temp=one; //temp=12
            one=two; //one=4
            two=temp; //two=12


        }


        if(one>three) {  // false //it will not be executed
            int temp=one; //temp=4
            one=three; //two=7
            three=temp; //three=12
        }

        if(one>four) {
            int temp=one; //temp=4;
            one=four;    //one=3;
            four=temp; //four=4;
        }

        if(two>three) { //two=12, three=7

            int temp=two; //temp=12
            two=three;     //7
            three=temp;   //three=12
        }
        if(two>four) { //two=7,four=4
            int temp=two; //temp=7
            two=four;  //two=4
            four=temp; //four=7
        }
        if (three>four) { //three=12 ,four=7
            int temp=three; //temp=12;
            three=four; //three=7
            four=temp;   //four=12
        }
        //one=,,,,two=  ,,, three=   four=

        System.out.println(""+one+"\n"+two+"\n"+three+"\n"+four);
        System.out.println(""+four+"\n"+three+"\n"+two+"\n"+one);
    }
}
