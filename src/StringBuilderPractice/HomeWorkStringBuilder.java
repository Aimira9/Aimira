package StringBuilderPractice;

import java.util.Arrays;

public class HomeWorkStringBuilder {
    public static void main(String[] args) {

        StringBuilder bag1=new StringBuilder("Prada");
        StringBuilder bag2=new StringBuilder("Michael Kors");
        StringBuilder bag3=new StringBuilder("Gucci");
        StringBuilder bag4=new StringBuilder("Dior");
        StringBuilder bag5=new StringBuilder("Zara");

        StringBuilder[] brands={bag1,bag2,bag3,bag4,bag5} ;
            System.out.println(Arrays.toString(brands));


        StringBuilder []  years=brands;

        for(int i=0;i<brands.length;i++) {
            years[i].append("-since 1913");
            System.out.println(years[i]);
        }
    }
}
