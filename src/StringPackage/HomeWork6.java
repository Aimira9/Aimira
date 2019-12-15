package StringPackage;

import java.util.Scanner;

public class HomeWork6 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in); //sc
        //Real Estate
        //Affiliate Marketing

        System.out.println("Provide first string ? ");
        //if you have a space between the word we need to use the nextLine()

        String name =input.nextLine();

        System.out.println("Provide second string ? ");

        String name2 =input.nextLine();

        boolean check1=name==name2;
        System.out.println(check1);

        boolean result =name.equalsIgnoreCase("r")==name2.equalsIgnoreCase("a");

        System.out.println(name.length());
        System.out.println(name2.length());

       boolean check2=name.length()==name2.length();
        System.out.println(check2);

        boolean check3=name.charAt(name.length()-1)==name2.charAt(name2.length()-1);
        System.out.println(check3);

        System.out.println("2019" +name +"2019"+name2);



        String aimira="Aimira";

        for(int i=aimira.length()-1;i>=0;i--) {

            System.out.println(aimira.charAt(i));
        }
    }
}
