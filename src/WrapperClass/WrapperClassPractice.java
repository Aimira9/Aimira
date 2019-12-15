package WrapperClass;

public class WrapperClassPractice {

    public static void main(String[] args) {

        //important thing related with byte and short:
        //once you create object from byte and short,you need to cast them

        //creating values:

        Byte by=new Byte((byte)12);

        Short sh=new Short((short)20);

        Integer in=new Integer(50);

        Long ln=new Long(45092);

        Double db=new Double(50.9);

        Float fl=new Float(43.89f);

        Boolean bl=new Boolean(true);

        Character ch=new Character('P');

        Byte by1=new Byte("12");
        //even though i gave the value as a string ,java will convert them to the object

        Short sh1=new Short("44");

        System.out.println(by1); //12
        System.out.println(sh1);  //44


        //Third way

        Integer num=198;
        Short num1=54;
        //if you provide the value directly without new keyword.You don't need to cast


        int number=55; //null

        Integer computers=null;

       // number=computers; //it will not give the compile time error ,It will give runtime error

       //System.out.println(number); //NullPointerException


        //Converting from string to primitive data types
        String values="455";
        //127* -128

        int valueInt=Integer.parseInt(values);

        System.out.println(valueInt); //455

        String convertBl="true";

        boolean convert=Boolean.parseBoolean(convertBl);
        System.out.println(convert); //true


        String intValue="900";
        int vl=Integer.parseInt(intValue);
        System.out.println(vl==900); //true
        //if you are converting String value of boolean to the primitive,
        //all values other than true or false it will assign as a false

        String table="true";
        Boolean tb=Boolean.valueOf(table);
        System.out.println(tb); //true



        // object- have method,they not primitive
        // wrapper class- Integer,Short.....
        // primitive ---> int,byte.....
        // converting----->valueOf();
        // parse();----> String to Primitive data types.

        String chair="c";
        Character ch2=new Character('c');

        //int phone=Integer.parseInt("a");
        //System.out.println(phone);//it will give the NumberFormatException


        //Integer phone=Integer.valueOf("12.56"); //.NumberFormatException
        //System.out.println(phone);

        int mouse=6;
        Integer mouse1=mouse;

        //mouse primitive is assigned as a wrapper class object
        //AutoBoxing is automatic conversion from primitive to wrapper class object
        //autoboxing for every primitive data types


        System.out.println(mouse1); //6

        char c='K';
        Character cr=c; //it is autoboxing

        boolean b=true;
        Boolean bn=b; //autoboxing

        Float ft=15.10f;
        float ft1=ft; //java automatically convert from objects to the primitive
        //it is called unboxing

        Double money=10000.99;
        double money1=money; //it is unboxing
        //unboxing can be apply for all the primitive data types
        //we cant apply string to wrapper class and valueof


        Character paper='1';
        boolean bln=paper.isDigit(paper);
        System.out.println(bln);  //true

        String stn="9U7nbox4ing1";




    }
}
