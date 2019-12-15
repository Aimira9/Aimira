package ForLOOP;

public class CharLoop {

    public static void main(String[] args) {

        //all primitive data types we can not use the string methods
        //char a='a' ;char b='b' ; a==b
        //String a="a" ; String b="b" ;a.equalsTo(b); a==b

        for (char ch='A'; ch<='Z'; ch++) {

            System.out.print(ch+ ","); // A B C
        }
    }
}
