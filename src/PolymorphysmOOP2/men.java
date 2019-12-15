package PolymorphysmOOP2;

public class men extends human implements dad {

    @Override
    public void eat() {
        System.out.println("men is eating ");
    }
    @Override
    public void walk() {
        System.out.println("men is walking ");
    }
    @Override
    public void shave() {
        System.out.println("men is shaving");
    }
    public void playSport() {
        System.out.println("men is playing soccer");
    }
    //4 overriden methods

    @Override
    public void feed() { //just regular method
        System.out.println("dad is feeding his family");

    }
}
