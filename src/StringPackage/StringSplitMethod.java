package StringPackage;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String schoolName="Techtorial Academy 2019 September April";

        String [] words=schoolName.split(" ");

        System.out.println(Arrays.toString(words));
        //first side is name of string
        //second side is name of your array
        for(String word:words) {
            if(word.startsWith("A")) {
                System.out.println(word);
            }

        }
        System.out.println("----------------");

        String date="09/16/2019";
        String [] year=date.split("/");
        //System.out.println(Arrays.toString(year));
       // System.out.println(year[0]);//09
        //System.out.println(year[1]); //16
        System.out.println(year[2]);// 2019

        String startDate="09.16.2019";
        String[] startDates=startDate.split(" /.");
        System.out.println(Arrays.toString(startDates));
       // String[] startDates=startDate.split(" \\."); // it is spliting






    }
}

