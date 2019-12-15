package StaticPractice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static  StaticPractice.StaticReview.test;
import static StaticPractice.StaticReview.*;
import static java.lang.Math.addExact;

import static StaticPractice.StaticReview.*;  // if we import static we dont need use classname

public class StaticReviewTest {

    public static void main(String[] args) {

        StaticReview rev=new StaticReview(); //run only one time
        StaticReview rev1=new StaticReview();

        StaticReview.test();
        test();

        //System.out.println(addExact(10,5));

        System.out.println(add(2,3)); //5
        System.out.println(substruct(10,5)); //5
        System.out.println(divide(20,5)); //4
        System.out.println(multiply(10,10));//100

        List<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(4);
        num.add(2);
        System.out.println(num);  //1 4 2

        Collections.sort(num);
        System.out.println(num); // 1 2 4




    }
}
