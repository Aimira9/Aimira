package ForLOOP;

public class IntegerNumber {

    public static void main(String[] args) {

       // int num=12345;
        //happy numbers
        //amstrong numbers
        //firstTime

        //number%10=5
        //6%10=6
        //15%10=5



        int number=12345;

        for(int i=3;i<5;i++){ //I<3

            System.out.println(number%10); //5 2 1

            number=number/10; //12 /10=1 /10=0

        }
        //System.out.println(number%10);
    }
}
