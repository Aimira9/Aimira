package SwitchStatement;

public class Practice {

    public static void main(String[] args) {

        char ch = 'a';
        final char hr='h';

        switch (ch) {

            case 'a':
                System.out.println("The value is apple");
                break;

            case'b':
                System.out.println("The value is BlackBerry");
                break;
            case hr :
                System.out.println("The value is HR");

                // in case statement values should be constant(not changing)
                //In java if yiu want to make one value as a constant
                //we are using final keyword


        }
    }
}