package variables;

public class PrimitiveDataTypes {


    public static void main(String[] args) {

        //Number data types without decimal:byte,short,int,long
        //Number data types with decimal point: double,float

        byte maxByteNumber=Byte.MAX_VALUE;

        System.out.println(maxByteNumber);

        byte minByteNumber=Byte.MIN_VALUE;

        System.out.println(minByteNumber);

        byte apple=100;
        byte number=-128;

        byte appleFresh=100;

        int totalApple=apple+appleFresh;

        int millionDollar=1_000_000;

        //byte, and int

        //short and long

        short chair=32000;

        long computer=2_000_000_000;

        //How to store the decimal numbers

        //double,float

        double pi=3.14;
        //int pi1=3.14;

        //float value shoild be and with f
        float tax=7.58245f;

        /*
        //Differences between float and double
        1-double you should use the double reserved keyword
          float you should use the float reserved keyword
          2-double will take more memory than float number
          3-to store the float the value should end with"f"
          to store the double it is not required.If you put the
           f for double it will automotically convert float to double.

         */




    }
}
