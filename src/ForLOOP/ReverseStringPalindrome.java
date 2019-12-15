package ForLOOP;

import org.w3c.dom.ls.LSOutput;

public class ReverseStringPalindrome {

    public static void main(String[] args) {

        String name = "civic";
        String reverse = "";

        //Palindrome
        //civic

        //for loop
        //after for loop print the reverse= "arimiA"


        for (int i = name.length() - 1; i >= 0; i--) {

            reverse += name.charAt(i);
        }System.out.println(reverse);

        if (name.equalsIgnoreCase(reverse)) {

            System.out.println("it is palindrome");

        } else {
            System.out.println("it is not palindrome");
        }



        }


}