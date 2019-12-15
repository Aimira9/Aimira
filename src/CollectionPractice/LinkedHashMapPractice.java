package CollectionPractice ;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice {

    public static void main(String[] args) {

        //Synchronization in java,if u sending multiple thread at the same time,and
        //if your code is waiting previous thread to complete it means your code  is thread
        //safe or it is called the code is synchronized

        LinkedHashMap<Integer,String> studentList=new LinkedHashMap<>();
        studentList.put(1,"aimira");
        studentList.put(2,"kira");
        studentList.put(3,"kubat");

        System.out.println(studentList);
    }
}
