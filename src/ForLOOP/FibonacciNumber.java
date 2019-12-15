package ForLOOP;

public class FibonacciNumber {

    public static void main(String[] args) {

        //sum of previous numbers
        //sum of the first two number is equals to next number
        //0,1
        //1-100;
        //0 1 2 3 5 8 13

        int num1=0,num2=1,sum=0;

        System.out.print(num1+ " " +num2);
        for(int i=1;i<8;i++) {

            sum=num1+num2; //1
            num1=num2; //1
            num2=sum; //num2=1

            System.out.print(" "+sum);


        }


    }
}
