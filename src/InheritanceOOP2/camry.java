package InheritanceOOP2;

public class camry extends car {

    public camry() {
        super(); //from car class
    }
    @Override
    public Integer velocity() {   //return type should be same
        return 125;
    }
    @Override
    public String carName() {
        return "camry";
    }
}
