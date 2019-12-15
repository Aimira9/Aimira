package WhileLoop;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {



        //using Scanner I will give the value
        //print out multiplication table until 10
        //using scanner enter 6
        //6*1=6
        //6*2=12
        //6*3=18
        //.....
        //6*10=60

        Scanner input=new Scanner(System.in);

        int number=input.nextInt();
        int count=1;
        while (count<=10) {
            System.out.println(number+"*" + count+"=" +number*count);
             count++;

        }
         //TasK
        //18/2=9
        // 9/2=4
        //4/2=2
        //2/2 =1
        //1/2=0

        //loop




    }
}
