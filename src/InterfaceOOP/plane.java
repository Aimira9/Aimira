package InterfaceOOP;

public class plane implements flyable,Sound {

    @Override
    public void fly() {
        System.out.println("plane is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bzhhhhh");
    }
}
