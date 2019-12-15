package StaticPractice;

public class StaticReview {

    //static instance variables
    //static method
    //*to  be able ,i dont need to create object

    //=====================
    //static block
    //*it will run one time
    //* it will run before everything in class
    //*to initialize the instance variables
    //*belongs to class

    //=====================

    //instance initialization  block
    //*instance block belongs object

    static String name;

    {
        System.out.println("this is instance block");
    }
    static {
        System.out.println("this is static block");

    }
    public static void test() { //static public void

        System.out.println("this is static method");
    }

    public  static int  add(int a ,int b) {
        int sum=0;
        sum=a+b;
        return sum;
        //return a+b;
    }
    public static int substruct(int a ,int b) {
        int sub=0;
        sub=a-b;
        return sub;
    }
    public static int divide(int a,int b) {
        int divide=0;
        divide=a/b;
        return divide;

    }
    public  static int multiply(int a,int b) {
        int mult=0;
        mult=a*b;
        return mult;
    }
}
