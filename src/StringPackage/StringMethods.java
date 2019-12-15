package StringPackage;

public class StringMethods {

    public static void main(String[] args) {


        String sName="techtorial";

        int num=1;

        num++; //2
        System.out.println(num);


        System.out.println(sName.toUpperCase()); //TECHTORIAL

        //String is immutable

        System.out.println(sName); //techtorial

        sName=sName.toUpperCase(); //String is assigned again

        System.out.println(sName); //TECHTORIAL


        //differences between primitive data type and String
        //1-string is immutable
        //2-primitive data types are mutable
        //3-String should be reaasigned to be able to change



        String student="ARSLAN";
        System.out.println(student.toLowerCase()); //arslan
        System.out.println(student); //ARSLAN
        student=student.toLowerCase();

        student+=" Kabul"; //student+Kabul
        // = it means assignment in java
        // ==  it means is equals to (comparison operators)

        System.out.println(student); //lower case arslan

        // String name="Tech";

        //String scholl =name.cancat("torial"); //techtorial,name=Tech

        //school.concat("Academy"); //school=Techtorial

        //System.out.println(name);//Tech

        //System.out.println(school);//Techtorial













    }
}
