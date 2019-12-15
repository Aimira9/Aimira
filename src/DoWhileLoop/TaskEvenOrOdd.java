package DoWhileLoop;

public class TaskEvenOrOdd {
    public static void main(String[] args) {

        int number = 10;

        if (number%2==0 ){

            System.out.println( number+"It is even  number ");
        } else {
            System.out.println(number+"It is odd number ");
        }
        //10-15
        //10,11,12,13,14,15

        //loop inside the loop i will print only even numbers

        int num1=10;
        int num2=15;

        while (num1<=num2) {
            //print num1 if its even number
            if (num1 % 2 == 1)  {
                //to find even or odd numbers we need:
                //even number=num1%2==0
                //odd number=num1%2==1
                System.out.println(num1);
            }
            num1++;
        }


        //print only odd number

    }
}