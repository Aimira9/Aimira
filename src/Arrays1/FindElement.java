package Arrays1;

import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {

        String[] colors={"red" ,"green" ,"black","white", "orange"}; //5

        //write a programm that will ask a user input a color
        //if your color is inside of your array then it will return "inside of array"
        //if your color is not in array it should return -1

        Scanner input=new Scanner(System.in);
        System.out.println("provide a color");
        String color=input.next();

        int count=0;

        for (String c:colors) { //foreach loop //array
            if(color.equalsIgnoreCase(c)){
                System.out.println("your color is inside of array. ");
                break; //break forloop

            }
            count++;
            //1==5
            if(count==colors.length) {
                System.out.println("-1");
                //else{
                //System.out.println("-1");
            }





            }


    }
}
