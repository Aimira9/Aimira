package variables;

public class UneryOperator {

    public static void main(String[] args) {

        int studentAge=25;

        studentAge++;  //26

        studentAge--;  //25

        ++studentAge;  //26

        --studentAge; //25

        studentAge =studentAge++; //25
        //26


        System.out.println("Student age is " +studentAge);


        studentAge=2*studentAge++;
        //25*2=50
        System.out.println(studentAge) ;



        studentAge=2*++studentAge;
        //2*51=102
        System.out.println(studentAge) ;

        int x=3;       //x=4
        int k=++x*5;   //k=4*5=20

        System.out.println("X "  + x);

        System.out.println("K "  + k );


        int M =++x*5/x--;
        //4*5=20
        //20/4=5


         System.out.println ("M "  + M);


         int T=++x*5/x--+--x;
         System.out.println("T "  + T);
         //4*5=20
        //20/4=5
        //5+3=8

        int n=4;
        // n=5
        //  if we use after variable n will increase after finishing the execution
        // execution will finish with semicolon

        int r=n++-1;
        //r=4-1=3

        System.out.println("N is " +n);
        System.out.println("R is " +r);

        int W =++n+n++-3;
        //6+6=12
        //12-3=9
        System.out.println("W "  + W);


    }
}
