package InheritanceOOP3;

//if we will write final noone can extend this class

public class staticBlocks {
    String name;
    public static final  String LEGALSTATUS;  //final is constant //we give only one value and we can't change it later

    static {
        LEGALSTATUS ="Citizen";
        //final variables we can initialize in static block
        System.out.println("I am static block from staticBlock class");
    }

    {
        //LEGALSTATUS="Citizen";  //if no static we can initialize  in instance block
        System.out.println("I am instance block of StaticBlock class");
    }

    public staticBlocks() {
        System.out.println("I am a constructor of staticBlock class");
    }

}
