package DoWhileLoop;


import java.util.Scanner;

public class hwLoopPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 3;
        String star = "*****";

        while (star .length()>=1) {

            System.out.println(star);

            star=star.substring(0,star.length()-1);

        }






    }
}
