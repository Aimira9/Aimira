package IfStatement;

import java.util.Scanner;

public class hwAmazonPrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter price ");
        int price = input.nextInt();

        System.out.println("Please enter review ");
        int review = input.nextInt();

        System.out.println("Please enter star rating");
        int rating = input.nextInt();

        if (price < 50 && review > 200 && rating > 4) {
            System.out.println("Product in the first page");

        }else if (price >50 && review>200 &&rating>4 ) {
            System.out.println("Product on the second page");

        } else if(price>50 && review<200 &&rating>4) {
            System.out.println("Product on the third page");

        }else if (price>50 && review<200 && rating<4) {
            System.out.println("Product on the forth page");

        }else System.out.println("Remove product from Amazon");

    }
}
