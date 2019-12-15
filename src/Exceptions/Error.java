package Exceptions;

public class Error {
    public static void myMethod() {

        //we must not handle errors
        //this is StackOverflowError
        System.out.println("i am inside of my method "); //with no semicolon is syntax error
        myMethod(); //StackOverflowError
    }

    public static void main(String[] args) {
        myMethod(); //runtime error
    }
}
