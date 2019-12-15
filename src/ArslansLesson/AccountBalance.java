package ArslansLesson;

import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {

        //account balance
        //transaction
        //account balance-transaction

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your balance ?");
        int balance=input.nextInt();

        while(balance>0) {

            System.out.println("Please enter your transaction ? ");
            int trans=input.nextInt();
            if (balance<trans) {

                System.out.println("Hey, u don't have enough balance to make this transaction.Your balance is  "+balance);
            }else{
                balance=balance-trans;
                System.out.println("Your new balance is :" +balance);
            }



        }
    }
}
