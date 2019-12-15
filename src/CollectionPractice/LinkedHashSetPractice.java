package CollectionPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetPractice {

    public static void main(String[] args) {

        LinkedHashSet number=new LinkedHashSet();
        number.add(10);
        number.add(30);
        number.add(20);

        System.out.println(number);
        //linkedHashset follows the insertion order
        //hashset does not follow the insertion order
        //in linkedhashset everything is same with the Hashset except order
        //all the method which set has,we can use in the LinkedHashSEt

        //Set names=new LinkedHashSet();
        //linkedHashSet<Integer> number=new LinkedHashSet<>();

        TreeSet<String> eventAttandanceList=new TreeSet<>();
        eventAttandanceList.add("Mike");
        eventAttandanceList.add("Jennifer");
        eventAttandanceList.add("John");
        eventAttandanceList.add("David");//alphabet
       // eventAttandanceList.add(null); we cannot store nullvalue

        System.out.println(eventAttandanceList);
        //treeset folows the ascending order
        //treeset does not accept null values.it will give the null exception

        Iterator<String> i=eventAttandanceList.descendingIterator();
        while(i.hasNext()) {
            System.out.print(i.next()+ " ");
        }

        System.out.println();

        System.out.println(eventAttandanceList); //it will not change

        eventAttandanceList.pollFirst();
        System.out.println(eventAttandanceList); //it will printed without first element

        eventAttandanceList.pollLast();
        System.out.println(eventAttandanceList);//it will printed without last element

    }
}
