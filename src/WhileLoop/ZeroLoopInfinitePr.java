package WhileLoop;

public class ZeroLoopInfinitePr {

    public static void main(String[] args) {

        //if your boolean condition is returning false ,there will no any iterations


        //ZERO LOOP ITERATION

        int phonePr=800;
        int currentMon=400;

        while(currentMon>phonePr) {

            System.out.println("You can buy the phone "); //nothing
        }


        //Infinite LOOP
        //IF YOUR BOOLEAN CONDITION IS RETURNING TRUE ,YOU WILL BE EXECUTING YOUR CODE INFINITE

        int phonePr1=800;
        int currentMon1=500;


        while(currentMon1>phonePr1) {
            System.out.println("you can buy the phone");

        }

        //less one minutes

        int phonePr2=100;
        int currentMon2=2000;
        int count1=1;


        while(currentMon2>= phonePr2) {
            System.out.println(count1 + " i can buy the phone ");

            currentMon2=currentMon2-phonePr2; //1loop=1500 2loop=1000 3loop=500
            //2000-500=1500
            count1++;

        }

    }
}
