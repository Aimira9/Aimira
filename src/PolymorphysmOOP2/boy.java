package PolymorphysmOOP2;

public class boy extends men  {

    @Override
    public void eat() {
        System.out.println("boy is eating");
    }
    public void run() {
        System.out.println("boy is running ");
    }
    public void cry() {
        System.out.println("boy is crying ");
    }
}
