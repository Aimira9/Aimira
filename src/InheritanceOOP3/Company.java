package InheritanceOOP3;


public class Company extends Object {

    String name;

    public Company (String name ) {
        this.name=name;
    }

    public Number employees() { //method signature //number is parent class //it might be short,integer,double,float
        return 250;
    }
    public Object progress() { //it might be string
        return "In the middle of the project";
    }
    protected int buildings(){
        return 3;
    }
    Boolean hire() {
        return true;
    }


}
