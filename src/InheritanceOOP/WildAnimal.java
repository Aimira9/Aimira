package InheritanceOOP;

public class WildAnimal extends Animal {

    @Override //annotation
    public void eat() {
        System.out.println("wild animal is eating meat");
        //overriding-pereopredelenie
    }
    @Override
    public void sleep() {
        System.out.println("wild animal is not sleeping ");
    }
    public void fight() {

        System.out.println("wild animal is fighting ");
    }

}
