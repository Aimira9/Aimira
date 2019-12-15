package StringPackage;

import java.util.Scanner;

public class ProjectDayThree2 {

    public static void main(String[] args) {


        Scanner input=new Scanner (System.in);

        System.out.println("Give me please random word");
        String randomWord=input.nextLine();



        System.out.println("Input number of letters that word has");
        int numbers=input.nextInt();

        boolean correctNumbers=numbers==randomWord.length();

        System.out.println("The numbers you entered is "+correctNumbers);

        System.out.println("Enter a letter that you want to find a index for");

        String letter=input.next();

        System.out.println("The index of letter you asked is "+randomWord.indexOf(letter));




    }
}
