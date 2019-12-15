package CollectionPractice;

import java.util.LinkedHashMap;
import java.util.Set;

public class ChildTest {
    public static void main(String[] args) {


        childClass childs1 = new childClass("Aimira", 5, "f", "chicago");
        childClass childs2 = new childClass("kira", 6, "f", "chicago");
        childClass childs3 = new childClass("kubat", 7, "m", "chicago");
        childClass childs4 = new childClass("faaf", 8, "m", "chicago");
        childClass childs5 = new childClass("kaak", 9, "f", "chicago");

       // System.out.println(childs1.getName());//will print name of first child

        LinkedHashMap<Integer,childClass> childMap=new LinkedHashMap<>();

        childMap.put(1,childs1);
        childMap.put(2,childs2);
        childMap.put(3,childs3);
        childMap.put(4,childs4);
        childMap.put(5,childs5);

        Set<Integer> keyList=childMap.keySet();
        for(Integer c:keyList) {
           // childMap.get(c);
            System.out.println(childMap.get(c).getName());
            System.out.println(childMap.get(c).checkGoToSchool());
            System.out.println(childMap.get(c).isPalindrome(childMap.get(c).getName()));
        }


    }
}
