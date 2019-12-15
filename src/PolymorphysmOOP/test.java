package PolymorphysmOOP;

public class test {

    public static void main(String[] args) {

        //reference side has to be Super class
        //object side has to be child class
        Super child=new Granchild(); //from child class
        child.myMethod(); //from child class //print last overriden one
        child.staticMethod(); //from Super class

        //only gives method of super class

       // child.childMethod

        System.out.println("=============");

        Child child1=new Granchild();
        child1.childMethod(); //from grandchild class
        child1.myMethod();   //from child class
        child1.staticMethod(); //from child class

        System.out.println("========");

        Super  child2=new Granchild();
        ((Child) child1).childMethod(); //casting //from granchild //last overriden
        ((Child)child2).staticMethod(); //from child class
        ((Granchild)child2).staticMethod(); //from grandchild class


    }
}
