package Methods;

public class Calculator {

    public static void main(String[] args) {
        myMethod("Techtorial");

    }
    //public->access modifier
    //void->return type
    //myMethod ->method name
    //String name  ->parameter
    //myMethod(String name) ->signature
    //static -> static and non static

    public static void myMethod(String name) {
        System.out.println("my name is :  " +name);

    }
}
