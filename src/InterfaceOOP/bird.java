package InterfaceOOP;

public class bird implements flyable ,Sound {
    //extends = 1
    //implements = as many as we want


    @Override
    public void fly() {
        System.out.println("bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("chic chic ");
    }
}
