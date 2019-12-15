package InheritanceOOP3;

public class example extends staticBlocks {

    static  {
        System.out.println("i am static block of example class"); //this is static block
    }

    {
        System.out.println("i am instance block of example class"); //this is instance block
    }
    public example() {
        System.out.println("i am constructor of example class"); //this is just constructor
    }
}
