package StaticPractice;

public class Book {

    String name;
    //i wanna store only business book
    String kind;
    //it will be always same author (Jihm Rohn)
    String author;
    int pages;
    int count;

    //instance initialization block
    //we are using this block to initialize our instance variables.
    {
        kind="Business Book";
        author="Jihm Rohn";
        count++;

        System.out.println("this instance initialization block");
    }

    static {
        //we r using static block to initialize our instance variables

        System.out.println("This is static block.I will be executed only one time");
    }

    public Book(String name,int pages) {
        this.name=name;
        this.pages=pages;

    }

}
