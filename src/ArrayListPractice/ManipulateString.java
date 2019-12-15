package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManipulateString {

    String mainString; //instance variable,instance field

    public ManipulateString() {

    }

    public ManipulateString(String mainString) {

        this.mainString = mainString;
    }


    public int sumNumber() {

        int sum=0;
        for (int i = 0; i < mainString.length(); i++) {
            if(Character.isDigit(mainString.charAt(i))){

                String ch=String.valueOf(mainString.charAt(i));
                int num=Integer.parseInt(ch);
                sum+=num;

                //sum+=mainString.charAt(i); its not correct because its char

            }
            //System.out.println(mainString.charAt(i));
        }

        return sum;
    }

    public ArrayList <Character> getLetterList() {
        ArrayList <Character> letterList=new ArrayList<>();
        for(int i=0;i<mainString.length();i++) {

            if(Character.isAlphabetic(mainString.charAt(i))) {
                letterList.add(mainString.charAt(i));

            }
        }
        return letterList;

    }




}
