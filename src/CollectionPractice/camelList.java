package CollectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class camelList {

    public void getNames(Map <String ,String> camel) {
        Set<String> cam = camel.keySet();
        for (String cam1 : cam) {
            if (cam1.startsWith("1")) {
                System.out.println(camel.get(cam1));
            }
        }
    }

    public static void main(String[] args) {

        Map<String,String> camelList=new HashMap<>();

       camelList.put("1p32m","Camel one");
       camelList.put("3hjk5","Camel Two");
        camelList.put("3jbc6","Camel Three");
       camelList.put("13hvhg","Camel Four");
       camelList.put("45thf","Camel Five");

       camelList c=new camelList();
       c.getNames(camelList);

        System.out.println(camelList.entrySet()); //returning all the keys and  values

        camelList.clear(); //will remove every element from the map
        System.out.println(camelList);

    }






}
