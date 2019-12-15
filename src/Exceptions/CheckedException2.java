package Exceptions;

public class CheckedException2 {

    public static void main(String[] args) throws Exception {

        System.out.println("i am going to sleep....");

        Thread.sleep(5000); //code will sleep for 5sec //checked exception
        System.out.println("i woke up !!!");

        try {
            System.out.println(5 / 0);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("i finished my code ");
    }
}
