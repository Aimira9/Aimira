package StringPackage;

import java.util.Scanner;

public class HomeWorkChase {


    public static void main(String[] args) {


       //Using scanner input three string like
        //Example String 1: Chase, Bank Of America, Google
       // Example String 2: Chase, Chase, Chase
       // 1- Print first char of these three String
       // 2- Print Last char of the these three String
       // 3- Print middle char of this three String
      //  4- Print Lenght of this Strings
      //  5- Print 4th char of this Strings
        //6- Print index of “k” from this Strings


        Scanner input=new Scanner (System.in);


        System.out.println("Give me please Strings");


        String one =input.nextLine();
        String two=input.nextLine();
        String three =input.nextLine();

        System.out.println(" First String is  " + (one.charAt(0) ));

        System.out.println("Second String is  " + (two.charAt(0) ));
        System.out.println("Third String is  " + (three.charAt(0) ));

        System.out.println(one.charAt(one.length()-1)) ;
        System.out.println(two.charAt(two.length()-1)) ;
        System.out.println(three.charAt(three.length()-1)) ;

        System.out.println(one.charAt((one.length()-1)/2));
        System.out.println(two.charAt((two.length()-1)/2));
        System.out.println(three.charAt((three.length()-1)/2));

        System.out.println("String length is "+ one.length());
        System.out.println("String length is "+ two.length());
        System.out.println("String length is "+ three.length());


        System.out.println(" forth String is  " + (one.charAt(4) ));
        System.out.println(" forth String is  " + (two.charAt(4) ));
        System.out.println(" forth String is  " + (three.charAt(4) ));

        System.out.println(one.indexOf("k"));
        System.out.println(two.indexOf("k"));
        System.out.println(three.indexOf("k"));






    }
}
