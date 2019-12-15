package CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {

        //Since set bis interface you can not instantiate the set
        //HashSEt ,LinkedSet,TreeSEt
        //Set requires the import ,it is coming from util package

        //Set<Integer> num=new Set<Integer>(); //right side can not be set

        Set<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20); //it will not store second 20 to my numbers ,,it will not print

        System.out.println(numbers); //different order because == set is not ordered collection // 1 20 40 10 30

        //hashset is not allowing to store duplicate elements
        //add method --> first checking the element is store to the Set or not
        //if the value is not stored before it will store the value
        //if the value is already present in the set it will not store

        Set<Integer> values=new HashSet<>();
        values.addAll(numbers);
        System.out.println(values);


        Iterator<Integer> iterate=values.iterator(); //return type is iterator
        while(iterate.hasNext()) {
            if (iterate.next() == 10) { //30
                System.out.println(iterate.next());
            }
        }


            for (Integer num : values) {
                if(num==20){
                    System.out.println("This is from foreach loop" +num);


            }
        }
        System.out.println(values.contains(40)); //true
        System.out.println(values.contains(50));//false

        values.clear();
        System.out.println("this is after clear method");
        System.out.println(values); //empty //will clear everything

        System.out.println(values.isEmpty()); //true


        System.out.println(numbers);
        numbers.remove(40);
        System.out.println("this is after remove method" +numbers);




    }
}
