package StringPackage;

import java.util.Scanner;

public class StringReplace {

    public static void main(String[] args) {


        String success="dotentimesmore";
        //"do<br>ten<br>times<br>more"


        success.replace('d','D');
        // for changing the first letter to upper case we need do re assignment
        // success= success.replace ---we need do re assignment
        System.out.println(success);
        success=success.replace("ten","eleven");
        System.out.println(success);
        success=success.replace('m','M');
        System.out.println(success);


        success=success.replace('X', 'M');


        //success.replace('X', 'M')
        //it will search the string to find oldchar or oldString
        //if its not able find it will not vhange the value



        //TRIM

        String achievment=" do ten times more ";
        achievment.trim();
        System.out.println(achievment);

        //Using scanner give the following value
        //"   Zero To Hero   "
        //return only "Hero"
        //trim the spaces
        //replace Zero with "One"
        //print all of them upper case
        //return true if its equals  ignore  case to  "zero t hero"


        Scanner input=new Scanner(System.in);

        System.out.println("Give me some value please");

        String value=input.nextLine();

        value=value.trim();
        System.out.println(value);

        System.out.println(value.substring(value.indexOf("H")));


        value=value.replace("Zero","One");
        System.out.println(value);


        value=value.toUpperCase();
        System.out.println(value);


        System.out.println(value.equalsIgnoreCase("One To Hero")); //we can do boolean




























    }
}
