package DoWhileLoop;

import java.util.Scanner;

public class HomeWorkOilChange {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the number of years");

          int year =input.nextInt();
          int month=year*12;
          int count=1;

          do {
            System.out.println(count + " Oil Change");
           count++;
           month=month-3;


          } while (month>0);
    }
}
