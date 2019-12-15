package variables;

public class Coins {


    public static void main(String[] args) {

        /*

        Given whole value from 1 to 99, calculate how many quarters,dimes ,nickels,pennies?
         */
        //Arithmetic Operators in Java
        // +,*,_,/,%



        int cent=99;

        int quaters=99/25;

        int centRemainder=99%25; //24

        //10+10+4
        int dimes=centRemainder/10;

        int dimesReminder=centRemainder%10;

        int nickels=dimesReminder/5;

        int nickelsRemainder=dimesReminder%5;

        int pennies=nickelsRemainder/1;

        System.out.println(dimes);

        System.out.println("Dimes is" +dimes);

        System.out.println("Quarter is" +quaters);

        System.out.println ("Pennies is" +pennies);

        System.out.println("Nickels is" +nickels) ;

        //you need to convert Fahrangeitn to celcius
        //Formula: C=(F-32)

        //double fahrangeit=90

    }
}
