package TurnaryOperators;

public class TernaryPractice {

    public static void main(String[] args) {

        int x=10;
        int y=5;
        int z=0;
        int k=2;
        //TernaryOperators
        //booleanExpression ? value1:value2;

        System.out.println(x>y?8:9);
        System.out.println(y>x ? 8:9);
        System.out.println(x>y ?(z=7) :(z=3));

        System.out.println(x>y ? k++ : ++k); //k++ =2 (++2=3)
        System.out.println(k); //3

         // NOTE: the values doesn't have to be same data type
        System.out.println ( x<y || x==y ? 40:"Hello World");
        System.out.println( x>y ? 40:"Hello World");

        //both values does not have to be same data types
        //It should be at least two values and you can not put more than two values
        //ternary operators will start with boolean expression
        //after boolean condition There should be ? mark and values separated with :

         z=3;
        System.out.println( x>y ? ++z +z++  : z++ + ++z );
        //++z + z++ =
        // 4 + 4 =8

        System.out.println(z);  //++z + z++ = z=5

        // int s=x>y  ? 40: "Hello"; //compile time error

        System.out.println(x>y ? 40 : "Hello");
        System.out.println(10);
        System.out.println("HELLO");

        //NOTE: if you are assigning the value from the ternary operators
        // both side should be same data type.
        //However if you not assigning the value from ternary operator
        //just printing it is not required to be same data type

        byte bt=10;
        short st=30;

        int number=bt>st ? bt :st; //byte and short always automotically casting to int

        System.out.println(number);

        double db=10.5;
        float fl=5.5f;
       // long ln=1000l;
       // int number1=db>fl ? db : fl; --> it will not work
        double number1=db>fl ? db:fl;

    }
}
