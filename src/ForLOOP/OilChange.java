package ForLOOP;

public class OilChange {

    public static void main(String[] args) {

        //imagine i am change my oil after 2000miles
        // change oil one time
        //every 500miles i need full the my tank
        //4 times full the tank then change oil
        //my tank is empty i am getting "tank is empty" message
        //after 2000miles i am getting change oil message

        //i get the message for oil change ,then change the oil

        int count=1;
        int count1=1;

        for(int oil=0;oil<4;oil++) {

            System.out.println(count++ +"Please change the oil");

            for(int gas=0;gas<4;gas++){


                System.out.println(count1++ +"Please fuel the tank");
            }
        }
    }
}
