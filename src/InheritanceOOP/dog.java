package InheritanceOOP;

public class dog extends DomesticClass {

    @Override
    public void run() {
        System.out.println("dog is eating");
    }

    public void bark() {
        System.out.println("dog is barking");
    }
}
