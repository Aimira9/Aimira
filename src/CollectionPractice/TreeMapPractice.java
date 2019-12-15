package CollectionPractice;

import java.util.TreeMap;

public class TreeMapPractice {

    public static void main(String[] args) {

        TreeMap<String,String> phoneList=new TreeMap<>();
        phoneList.put("Aimira","576");
        phoneList.put("Kira","6767");
        phoneList.put("Kubat","67575");

       phoneList.put("james",null);

        System.out.println(phoneList);
    }
}
