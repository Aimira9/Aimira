package PolymorphysmOOP;

public class Child extends Super {

    @Override //overriden
    public void myMethod() {
        System.out.println("i am inside of child class");

    }
    public static void staticMethod() { //we cannot override static method //hidden
        System.out.println("i am static method from child class");

    }

    public void childMethod() { //regular method
        System.out.println("i am child method from child class ");
    }
}
