package InheritanceOOP2;

public class SchoolBus extends bus {

    @Override
    public Double maxSpeed() { //double is covariant
        return 60.5;
    }

    @Override
    public String  busName() { //boolean ,integer is covariant ,,integer subclass of number,,number subclass of object
        return "School Bus";
    }

}
