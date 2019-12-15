package ConstructorPractice;

public class NumberPractice {

    public int multiply(int num) {

        return  num*10;
    }
    public double remainder(int value) {
        return  value %4;
    }

    public static void main(String[] args) {

        int appleNum=10;

        NumberPractice apple=new NumberPractice();

        apple.multiply(appleNum); //10
        System.out.println(appleNum); //since method took the copy of the appleNumber
        //Apple number value is not changing

        appleNum=apple.multiply(appleNum); //100
        System.out.println(appleNum);

        System.out.println(apple.remainder(appleNum)); //100%4==0.0

        System.out.println(appleNum); //100

    }
}
