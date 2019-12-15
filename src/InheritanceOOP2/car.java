package InheritanceOOP2;

public class car extends  vehicle{

    public car() {
        super("toyota");
    }
    public car(String make){

        super("lexus");
    }
    public Integer velocity() {  //number parent class of integer
        return 100;
    }
    public String carName() {
        return "car";
    }

}
