package StringBuilderPractice;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder table=new StringBuilder();

        StringBuilder table1=new StringBuilder("Rockwell");

        System.out.println(table);

        table.append("ikea");
        //dynamic polymorphism =java doesn't know until runtime
        System.out.println(table);

        table.append(10);
        System.out.println(table);

        table1.append(10.4);
        System.out.println(table1);
        StringBuilder success=new StringBuilder().append(" Techtorial ").append(2019);
        success.append("Best year ever").append(true);

        System.out.println(success);

        //new StringBuilder().append("Tech") ==

        //"tech"


        System.out.println("Tech".charAt(0)); //T

        StringBuilder computer=new StringBuilder();

        for (char i='a';i<='z';i++) {
            computer.append(i);
        }
        System.out.println(computer); //alphabet  a-z


        StringBuilder tree=new StringBuilder("Oak");
        StringBuilder tree1=new StringBuilder("Oak").append(" 14");
        System.out.println(tree); //oak
        System.out.println(tree1); //oak14

        char nm=tree.charAt(0); //char
        System.out.println(nm);  //0
        System.out.println(tree); //oak

        //if you call the method and return type is StringBuilder, in this your original StringBuilder value will change
        //.append(); --> StringBuilder

       int index= tree.indexOf("ak"); //ak=1 ;
        System.out.println(index);

       int lenght= tree.length();
        System.out.println(lenght);

        String subs=tree.substring(1);
        System.out.println(subs); //ak
        System.out.println(tree); //oak

        //after string we can not aopend
       // tree1=Oak 14;
        tree1.append("10").append(true).substring(5);
        System.out.println(tree1);//Oak 1410 true

        String tr=tree1.append("10").append(true).substring(5);

        System.out.println(tr); //410true10true

        tree1.append('K');
        System.out.println(tree1);//Oak 1410 trueK

        //return type of append is StringBuilder






        StringBuilder apple=new StringBuilder("Aple");

        apple.insert(1,"p");

        System.out.println(apple);

        apple.insert(5,"s number is 10");
        System.out.println(apple);


        System.out.println(apple);
        System.out.println(tree);
        System.out.println(tree1);
        // // lo-op .insert(2,"-");
        //StringBuilder[] builders=new StringBuilder[5];

        StringBuilder[] builders={tree,tree1,computer,apple};
        //task store the - after second index in String Builder object
        for(StringBuilder b:builders) {
            b.insert(2,"-");
            System.out.println(b);

        }
        System.out.println(Arrays.toString(builders));


        StringBuilder mouse=new StringBuilder("Microsoft");

        mouse.delete(0,3); //starting from 0 until 3  //its deleted 0 1 2
        //rosoft

        System.out.println(mouse);

        mouse.deleteCharAt(2); //it will delete 2index,2index=
        System.out.println(mouse); //rooft

        mouse.reverse();
        System.out.println(mouse); //tfoor

        String mouse1=mouse.toString();
        String mouse2=mouse.substring(0);

        String mouse3="mouse";

        System.out.println(mouse1);
        System.out.println(mouse2);
        System.out.println(mouse3);







    }
}
