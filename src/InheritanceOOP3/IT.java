package InheritanceOOP3;

public class IT  extends Company{

    public IT() {
        super("Google");
    }
    @Override
    public Integer employees() {
        return 200;
    }
    @Override
    public String progress() { //is more accesible
        return "in the middle of Project 2";
    }
    @Override
    public Boolean hire() {
        return true;
    }


}
