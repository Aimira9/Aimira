package StringPackage;

import java.util.Scanner;

public class HomeworkREAL {

    public static void main(String[] args) {
        //Real Estate
        //Affiliate Marketing

        Scanner sc=new Scanner(System.in);
        System.out.println("Provide two strings ? ");

        String real=sc.nextLine();
        String marketing=sc.nextLine();


        boolean equals=real.equalsIgnoreCase(marketing);
        System.out.println(equals);

        //""+marketing.charAt(0);
        //"Tech"+1;


        boolean firstLetter=real.charAt(0)==marketing.charAt(0);
        System.out.println(firstLetter);

        boolean length=real.length()==marketing.length();
        System.out.println(length);
        //All primkitive data types we need to use logical operators
        //== ,, >=,,, <=  ,,, <  ,,   >  ,,  !=
        //String compare the values we can not use the logical operator


        //2019
        real="2019 "+real;
        marketing="2019 "+marketing;

        System.out.println(real);
        System.out.println(marketing);



        //2019-Real-Estate
        real=real.replace(" ","-");
        System.out.println(real);


        marketing=marketing.replace(" ","-");
        System.out.println(marketing);

        System.out.println(real.substring(4,8).trim().toUpperCase());
        System.out.println(marketing.substring(4,8).trim().toUpperCase());





    }
}
