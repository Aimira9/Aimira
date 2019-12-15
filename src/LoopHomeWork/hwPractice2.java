package LoopHomeWork;

public class hwPractice2 {

    public static void main(String[] args) {
        int sum=0;
        int i=100;

        for (; i <= 200; i++) {

            if (i % 11 == 0) {
                System.out.println(i);

                sum=sum+i;
                //System.out.println("The sum of this number"+sum);
            }
        }//sum=sum+i;
        System.out.println("The sum of this number"+sum);
    }
}