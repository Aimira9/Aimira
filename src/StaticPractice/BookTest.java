package StaticPractice;

public class BookTest {


    public static void main(String[] args) {

        Book seven=new Book("Pillars",310);
        Book eight=new Book("Strategies ",360);


        //instance initialization block is belongs object
        //since count is belongs to the object
        //count value will be 1 after code runs
        System.out.println(seven.count);
        System.out.println(eight.count);
        System.out.println(seven.author);
        System.out.println(eight.author);
        System.out.println(seven.kind);
        System.out.println(eight.kind);
    }
}
