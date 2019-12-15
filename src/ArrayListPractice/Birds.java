package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {


    public static void main(String[] args) {

        List<String> birdList=new ArrayList<String>();

        birdList.add("Owl");
        birdList.add("Parrot");
        birdList.add("Penguin");

        Object [] listOfBird=birdList.toArray();//return type toArray method .The array type is Object

        List<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(11);
        number.add(55);

        Object [] numList =number.toArray();

        //if you are converting from arrayList to Array using toArray() method
        //you can only store as a object of the array
        //toArray()  method will  return the Object


        ////////////////////////////////////////////////////////////////
        //converting from array to arrayList

        String [] city={"Chicago","New York","San Francisco"};

        System.out.println(city.length);

        List<String> cityNames= Arrays.asList(city);
        System.out.println(cityNames.size());

        //cityNames.add("LA"); //we cant add anything after converting
        System.out.println(cityNames.size());

        //ArrayList  is not fixed size
        //however if you convert from Array to arrayList
        //arrayList size will be fixed

        List<String> cityNames1=new ArrayList<>(cityNames);
        System.out.println(cityNames1.get(0)); //chicago

        cityNames1.add("LA");
        System.out.println(cityNames1); //it will give all the elements inside my list

        //task
        //change all the element of city names1 with upperCase6

        for(int i=0;i<cityNames1.size();i++){

            cityNames1.set(i,cityNames1.get(i).toUpperCase());
        }
        System.out.println(cityNames1);
    }
}
