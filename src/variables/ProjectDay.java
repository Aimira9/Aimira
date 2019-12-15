package variables;

public class ProjectDay {

    public static void main(String[] args) {

        double minutesin1hour=60;


        double hoursinday=24;
        double daysinyear=365;

        double minutesinday=minutesin1hour*hoursinday;
        double minutesinyear=minutesinday*daysinyear;

        System.out.println("Minutes in one year " +minutesinday);
        System.out.println("Minutes in year " + minutesinyear);

        double oneMinute=1/minutesinyear;
        System.out.println("One minute " +oneMinute);
        //0.000001.90258751902587 year in one minute

        double $100min=100/minutesinyear;
        System.out.println("100 minutes " + $100min+"year");

        double $1000min=1000/minutesinyear;
        System.out.println("1000 minutes is " +$1000min+"years");

        double $11111min=11111/minutesinyear;
        System.out.println("11111 minutes is " +$11111min +"years");

        double $999999000000=999999000000f/minutesinyear;
        System.out.println("999999000000 min is " +$999999000000);

















    }
}
