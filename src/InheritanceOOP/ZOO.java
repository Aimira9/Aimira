package InheritanceOOP;

public class ZOO {
    public static void main(String[] args) {

        WildAnimal wildAnimal=new WildAnimal(); //creating object

        wildAnimal.eat(); //will print from override  (wildAnimal)
        wildAnimal.run(); //we didn't override this method ,will print from animal class

        System.out.println("===============");

        Animal an=new Animal(); //will print everything only from  animal class
        an.sleep();
        an.eat();

        DomesticClass domClass=new DomesticClass();
        domClass.run();

        System.out.println("=============");

        lion l=new lion();
        l.eat(); //it will print last overriding
        l.fight(); //wildanimal
        l.run();

        System.out.println("=====");

        dog d=new dog();
        d.eat();
        d.run();
        d.bark();
    }

}
