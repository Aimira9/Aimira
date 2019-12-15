package PolymorphysmOOP;

public class Granchild extends Child {

    @Override
    public void childMethod() {
        System.out.println("i am child method in grandchild class ");
    }
    public static void staticMethod() {
        System.out.println("i am static method in grandchild class");
    }
}
