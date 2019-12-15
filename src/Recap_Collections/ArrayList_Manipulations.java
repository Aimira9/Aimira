package Recap_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Manipulations {
    public static void main(String[] args) {

        //creating an arraylist
        ArrayList <Integer> ar1=new ArrayList<>();
        ArrayList <Integer> ar2=new ArrayList<Integer>();
        List<String> st1=new ArrayList<>();
        //creating arraylist with size
        ArrayList <Integer> ar3=new ArrayList<>(10);
        ar3.add(100);
        ArrayList <Integer> ar4=new ArrayList<>(ar3);
        //adding array to arraylist
        Integer [] num={3,5,7,9};
        //List<Integer> ar5= Arrays.asList(num);
        List<Integer> ar5=new ArrayList<>();
        for(Integer a:num) {
            ar5.add(a);
        }
        ar5.addAll(ar3);
        System.out.println(ar5.size()+"size");
        System.out.println(ar5);

        List<String> cities1=Arrays.asList(new String[]{"Moscow","Chicago"});
        System.out.println(cities1); //moscow chicago
        //add values
        List<String> cities2=new ArrayList<>(cities1);
        cities2.add("Istanbul"); // Moscow, Chicago, Istanbul
        System.out.println(cities2);
        cities2.add(1,"London"); //london will after moscow
        System.out.println(cities2);  //Moscow, London, Chicago, Istanbul

        cities2.addAll(cities2);
        System.out.println(cities2);//it will print double cities

        cities2.addAll(3,cities1);
        System.out.println(cities2); // after 3rd elem it will print cities1=moscow ,chicago

        //indexOf
        System.out.println(cities2.indexOf("London")); //first index of London //1
        System.out.println(cities2.lastIndexOf("London"));//last index //7


        //set element
        cities2.set(1,"LA");
        System.out.println(cities2);

        //remove
        cities2.remove("London");
        System.out.println(cities2); //it will remove the first London

        cities2.remove(6);
        System.out.println(cities2); //it will remove  the second London

        cities2.removeAll(cities1); //it will remove cities1
        System.out.println(cities2);

        cities2.clear();
        System.out.println(cities2);


        //check if list

        System.out.println(cities2.isEmpty()); //true
        System.out.println(cities2.size()==0); //true



    }
}
