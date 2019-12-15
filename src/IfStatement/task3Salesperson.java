package IfStatement;

import java.util.Scanner;

public class task3Salesperson {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Salesperson
        //Base =400$
        //Using scanner ask How much they earn on the week
        //Please enter for monday
        //5days
        //u need to find how much they  earn a week
        //total product price is more than 800$ they will get %5 comission
        //40$+400$ =440$ they will get paid
        //if total sale is more than 800 apply 5% comission
        //if total sale is less than 800 don't apply comission and GIVE THE BASE SALAry


        System.out.println("Enter for Monday");
        int monday = input.nextInt();

        System.out.println("Enter for Tuesday");
        int tuesday = input.nextInt();

        System.out.println("Enter for Wednesday");
        int wednesday = input.nextInt();

        System.out.println("Enter for Thursday");
        int thursday = input.nextInt();

        System.out.println("Enter for Friday");
        int friday = input.nextInt();

        double total = monday + tuesday + wednesday + thursday + friday;
        //400+500=900+5%=945

        int baseSalary = 400;

        double weeklyPayment;




       if (total>=800 && total<1000) {

           weeklyPayment = baseSalary + total * 5 / 100;

           System.out.println("Total weekly payment with 5% bonus is " + weeklyPayment);
       }
       else if (total>=1000 && total <1200) {

           weeklyPayment=baseSalary+total*7/100;

           System.out.println( "Total weekly payment with  7% bonus is " + weeklyPayment);
       }
       else if (total>=1200 && total <1400) {

           weeklyPayment=baseSalary+total*9/100;

           System.out.println( "Total weekly payment with  9% bonus is " + weeklyPayment);
       }
       else if (total>=1400) {

           weeklyPayment=baseSalary+total*11/100;

           System.out.println( "Total weekly payment with  11% bonus is " + weeklyPayment);

       }
       else {
           System.out.println("only base salary" +baseSalary);
       }






























    }
}
