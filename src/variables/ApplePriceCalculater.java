package variables;

public class ApplePriceCalculater {


    public static void main(String[] args) {

        //apple price in Fresh Market is 1$
        int appleFreshMarket = 10;

        //apple price in Whole Foods 3$
        int appleWholeFoods = 15;

        //int totalAppleNumber=12+7
        int totalAppleNumber = appleFreshMarket + appleWholeFoods;

        System.out.println("My total apple number is" + totalAppleNumber);

        int freshMarketPayment=appleFreshMarket*1;

        int WholeFoodsPayment=appleWholeFoods*3;

        System.out.println("Total payment for fresh Market is" +freshMarketPayment);

        System.out.println("Total payment for whole foods is "+WholeFoodsPayment);

        int totalPayment=freshMarketPayment+WholeFoodsPayment;

        System.out.println("Total payment is" +totalPayment);


        System.out.println(freshMarketPayment+WholeFoodsPayment);

        System.out.println("20 "+ "39");

        System.out.println("20"+WholeFoodsPayment);

        //decimal number for 'A' is 65
        //in int  we can not store the character thats's why it will automotically convert
        //character to decimal
        int A='A';

        System.out.println (A);
        //2039

        //max and min number

        //declaring the variables where we are giving data type (int)
        //and giving the name for variables
        int studentNumber;


        //initialize the variables is giving value for variables
        studentNumber=25;


        //you can start the variables with underscore(_) and $ or letter
                int $dateYear=1998;
                 int _dateYear=1998;
                 int dateYear2=1998;

                 //you can end variable names with number

        int dateYear1=2000;


        //you can not use same name two times
        //you can not use same name as java reserved work

        int maxNumber=Integer.MAX_VALUE;
        System.out.println("Max number for integer is"+maxNumber);
        //2147483647

        int number=2147483647;

        int minNumber=Integer.MIN_VALUE;

        System.out.println("Min number for integer is" +minNumber);

        //-2147483647
        //32 bit equals 4 byte
        int mNumber=-2147483648;
    }
}