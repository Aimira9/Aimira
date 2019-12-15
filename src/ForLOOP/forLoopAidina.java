package ForLOOP;

import java.util.Scanner;

public class forLoopAidina {

    public static void main(String[] args) {


        String star = "*";

        for (int i = 5; i >= 1; i--) {
            System.out.println();

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }


        }


        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) { //i+=2

            System.out.println(num + "*" + i + "=" + num * i);


        }
        for (int i = 1; i <= 5; i++) {
            System.out.println();

            for (int k = 1; k <= i; k++) {
                System.out.print("  *  ");


            }

        }


        System.out.println("=======");




        String name = "Aidina";

        for (int i = name.length()-1; i >= 0; i--) {

            System.out.println(name.charAt(i));
        }
    }
}
