package InheritanceOOP3;

public class OverloadingMethods {

    public static Number getNumber(Number num) {
        System.out.println("my parameter is  Number ");
        return 1;
    }

    protected static Integer getNumber(Integer num) {  //acces modif and return type can be different
        System.out.println("my parameter is Integer ");
        return 2;
    }
     static Double getNumber(Double num) {
        System.out.println("my parameter is Double");
        return 3.1;
    }
    //in static methods we can call only static variables and methods

    public static void main(String[] args) {
        getNumber(3);

    }
}
