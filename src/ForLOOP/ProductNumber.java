package ForLOOP;

public class ProductNumber {

    public static void main(String[] args) {

        //given a positive int number n, your task is to calculate
        //the differences between the product of this digits
        //and the sum of this  digits
        //NOTE: the order matters;the answer should be of the form product -sum;
        //Ex; n=123456,the output should be
        //1*2*3*4*5*6 -->product
        //sum=1+2+3+4+5+6;
        //result=product-sum

        //123456%10=6;
        //num=123456/10=12345;
        //num%10=5
        //num=number/10; 1234
        //number%10=4
        //num=number/10;123
        //number%10=3;
        //num=num/10;12

        int num=123456;
        int product=1;
        int sum=0;

        while(num>0) {

            System.out.println(num%10);
            product*=num%10;//6*1 , 6*5=30,30*4=120
            sum+=num%10;
            num=num/10;
        }
        //System.out.println(product);
        System.out.println(product-sum);
    }
}
