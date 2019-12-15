package ForLOOP;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("2");
        int count=0;

        for (int i=3;i<100;i++) { //2%1==0   2%2==0

           for (int k=2;k<i;k++) {
                //5
                //5--2 3 4 ->its prime number
                //7 -- 2 3 4 5 6 ->
                if (i%k==0) {
                    count++;
                }


            }
           if (count>0) {
               System.out.println(i + "Is not prime number");
           }else{
               System.out.println(i+"is prime number");
           }
           count=0;

        }
        // 2/2//13
        // 13%
    }
}
