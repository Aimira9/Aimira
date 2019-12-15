package InheritanceOOP;

public class DomesticClass extends Animal {
    //u cannot extend two class

    @Override
    public void eat() {
        System.out.println("domestic animal is eating ");
    }
    @Override
    public  void run() {
        System.out.println("domestic animal is running ");
    }
    @Override
    public void sleep() {
        System.out.println("domestic animal is sleeping ");
    }


}
