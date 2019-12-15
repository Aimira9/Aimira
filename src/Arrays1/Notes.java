package Arrays1;

import java.util.Arrays;

public class Notes {
    public static void main(String[] args) {

        String[] list = {"four", "score", "and", "seven", "years", "ago"};
        String[] temp = new String[list.length];
        int count = 0;
        for (int i = 1; i < list.length; i++) {
            temp[i] = list[i - 1];
            i++;
        }
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i + 1];
            i++;
        }

        System.out.println(Arrays.toString(temp));
    }

    public String[] switchPairs(String[] list) {
        String[] temp1 = new String[list.length];
        for (int i = 0; i < list.length - 1; i = i + 2) {
            String temp = list[i];
            list[i] = list[i + 1];
            list[i + 1] = temp;
        }
        for (int i = 0; i < list.length; i++) {

            return temp1;
        }
        return null;
    }

}




//    public String switchPairs(String[] list) {
//       String[] temp1 = new String[list.length];
//        for (int i = 0; i < list.length - 1; i = i + 2) {
//           String temp = list[i];
//           list[i] = list[i + 1];
//            list[i + 1] = temp;
//        }
//       for (int i = 0; i < list.length; i++) {
//
//            //return list[i];
//
//        }
//    }
//return list[i];
//
//
//}
