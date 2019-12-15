package Exceptions;

import java.io.IOException;

public class ThrowException {
    public static void main(String[] args) {

        try{
            System.err.println("i am about throw an exception");
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0); //will not execute finallu block
        }finally {
            System.out.println("i am finally here");
        }
        }
}
