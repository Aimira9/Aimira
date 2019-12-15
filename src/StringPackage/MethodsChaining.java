package StringPackage;

public class MethodsChaining {

    public static void main(String[] args) {

        String city="Des Plaines     ";

        System.out.println(city.substring(4).toUpperCase().replace("P","T").trim());
        System.out.println(city.indexOf("P"));



        //after following method we can do method chaining
        //substring,toUpperCase, to LowerCase,Replace,Trim
        //After following methods we can NOT do method chaining
          //lenght,charAt,indexOf,contains,equals,equalsIgnoreCase,startWith,endWith
        //number,char,number,true/false,true/false,true/false,t/f,t/f




    }
}
