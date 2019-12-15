package InterfaceOOP;

public class example {

    public static void main(String[] args) {
        //we cant instantiate interfaces

        bird b=new bird();
        b.fly();
        b.makeNoise();

        System.out.println("==================");

        plane p=new plane();
        p.fly();
        p.makeNoise();

        System.out.println("==================");

        Macy m=new Macy();
        System.out.println( m.countEmployees()); //250
        m.sellItem();
        m.displayItem();


    }
}
