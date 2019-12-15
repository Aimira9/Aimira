package CollectionPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task1 {

    HashSet<String> Aimira;

    public void getLetter(String str) {

        Map<Character,Integer> letters=new HashMap<>();
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(letters.containsKey(ch)) {

                int count = letters.get(ch);
                letters.replace(ch, ++count);
            }else{
                letters.put(ch,1);

            }



        }
    }

}
