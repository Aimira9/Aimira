package variables;

import jdk.jfr.Percentage;

public class AutomationEngineer {

    public static void main(String[] args) {


        int for1hour=60;
        int dayhours=8;

        int annualsalary=for1hour*dayhours;

        System.out.println("Annual salary of the person per day is $ " +annualsalary) ;

        int dayin1month=20;
        int annualsalarypermonth=dayin1month*annualsalary;

        System.out.println("Annual salary of the person per month is $ " +annualsalarypermonth);


        int statetax=8;
        int federaltax=11;

        int totaltax=statetax+federaltax;

        System.out.println("Total tax is " +totaltax);
        //8+11=19
        // 9600*19%=1824

        int totaltaxpayment=9600*19/100;







        System.out.println("Total tax amount per month is $ " + totaltaxpayment) ;









    }
}
