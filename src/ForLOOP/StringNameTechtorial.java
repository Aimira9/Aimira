package ForLOOP;

import java.util.Scanner;

public class StringNameTechtorial {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String name ="Techtorial Academy";
        //index will return number
        //charAt will return the char
        //index number y is 17
        //lenght is 19

        //System.out.println(name.charAt(18-1));
        //18 it will give the StringIndexOutOfBoundsException
        //runtime error

       // System.out.println(name.indexOf('k')); //indexOf('k')-- -1


        //System.out.println(name.replace('k', 'a'));
        //since there is no k inside my string ,it will remain same
        System.out.println(name.length());

        for(int i=0;i<=name.length()-1;i++) {

            //System.out.print(name.charAt(i) + ",");

            if (name.charAt(i)=='a' || name.charAt(i)=='A'){

                System.out.println(name.charAt(i));
            }
        }

    }
}
