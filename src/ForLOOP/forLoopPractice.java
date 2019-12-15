package ForLOOP;

public class forLoopPractice {

    public static void main(String[] args) {

        //int num ;int num1;

        //inside for loop we can put only two times ";"
        //both data types should be same
        //we can not put  more then two semicolon inside loop

        int i=0;
        for(;i<8;i++) {

            System.out.println(i); //0...7
        }

        System.out.println("outside of the loop "+ i);

        for (int k=0;k<5;k++) {

            int num=5; //since num is inside the loop i cannot use it outside of the loop
            num++;
        }
        //System.out.println(num); --> compile time error because ,num is inside the loop

        int num=0;
        for (int k=0;k<5;k++) {

            //num=5; //5
            num++;

        }
        System.out.println(num); //6
        //you can not use the variables outside of the loop if you initialize or declaring inside the loop
        //if you declare the variables outside of the loop you can use them inside loop

        //for (int r=0;long h =10;r<h;r++)--we can not use different data types in loop
        int s=0;
        long d=10;
        for (s=0,d=10;s<d;s++){

            System.out.println("hello");
        }

    }

}
