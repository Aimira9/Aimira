package StringPackage;

public class StringAdvance {

    public static void main(String[] args) {

        //initialize the name
        String name="Aimira";


        //re -assigning the name
        name="Kira";

        String sName=name+"Kubat ";

        String tName="Kira";


        System.out.println(name); //Kira
        System.out.println(sName);//Kira Kubat

        String computerName="Mac Pro";
        System.out.println(computerName +"2019"); //Mac Pro 2019

        computerName=computerName+ "2019";
        System.out.println(computerName);



        //Kira
        //Kira Kubat



        String schoolName="Techtorial";
        //length() will return number of the char in String.
        // Result will be int
        System.out.println("String length is "+ schoolName.length());

        String fullName=schoolName+" Academy";
        System.out.println("Full name length is" +fullName.length());


        String userName="techtorial2400"; //length is 14
        int userNameLength=userName.length();
        System.out.println(userNameLength); //14

        // in java counting start from the 1
        //in java indexing start from 0

        System.out.println(userName.charAt(0)); //t
        System.out.println(userName.charAt(3)); //h
        System.out.println(userName.charAt(7)); //i

        System.out.println(userName.charAt(9)); //l

        // if you wanna find out last char from the string
        //we need first find out the length of the string

        System.out.println(userName.charAt(userName.length() -1));



        // if in the index is not char ,java will throw an exception
        //StringIndexOutOfBoundException


        //5 a b c d e ==>5  ,,c=2
        //(length -1)/2

        String success="hustling";
        System.out.println(success.indexOf("s")); //2
        System.out.println(success.indexOf("in")); //5
        System.out.println(success.indexOf("k")); //-1


        //String success1="hustlingst";

        //System.out.println(success.indexOf(str: "s",fromindex:3));
        //indexOf will return first matching values' index

        //charAt will return the char from giving index. Will throw an exception length 10 --> 15th
        //indexOf will return index from giving String.If there is not matching it will give the -1

        String animal="Dragon Animal";
        //task find the last char from the animal
        //print the middle char from the string
        //print the first char from the string
        //find the second matching index of "n"  from the string
        //print the length of string
        //print the 20th char
        //print index of "k"

        System.out.println(animal.charAt(animal.length()-1)) ; //12 //l

        // (length-1)/2
        System.out.println(animal.charAt((animal.length()-1)/2));

        System.out.println(animal.charAt(1)); //r

        System.out.println(animal.indexOf("n",6)); //5  //"n" , 6

        System.out.println("String length is "+ animal.length()); //13

        System.out.println(animal.charAt(20)); //error

        System.out.println(animal.indexOf("k")); //-1




















    }
}
