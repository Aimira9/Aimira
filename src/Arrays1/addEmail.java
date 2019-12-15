package Arrays1;

import java.util.Arrays;

public class addEmail {

    public static void main(String[] args) {

        String names[] = {"lisa", "Kubat", "Yalcin", "Erkin", "Sema", "Kira"};

        //write program that will convert this names to emails and will save to array
        //f.e lisa@gmail.com
        String[] email = new String[names.length];

//        email[0] = "lisa@gmail.com";
//        email[1] = "kubat@gmail.com";
//        email[2] = "yalcin@gmail.com";
//        email[3] = "erkin@gmail.com ";
//        email[4] = "sema@gmail.com";
//        email[5] = "kira@gmail.com";

        for (int i = 0; i <names.length; i++) {
            email[i]=names[i]+"@gmail.com";
        }
        System.out.println(Arrays.toString(email));
    }
}
