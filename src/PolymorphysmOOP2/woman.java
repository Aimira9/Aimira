package PolymorphysmOOP2;

public class woman extends human  implements mother{

    @Override
    public void eat() {
        System.out.println("woman is eating");
    }
    public void walk() {
        System.out.println("woman is walking");
    }
    public void makeUp() {
        System.out.println("woman is doing make up ");
    }

    @Override
    public void takeCare() {
        System.out.println("mother is taking care of family ");
    }
}
