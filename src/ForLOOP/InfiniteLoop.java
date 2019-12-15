package ForLOOP;

public class InfiniteLoop {

    public static void main(String[] args) {

        //int i=0;

        for(int i=0;i<10;i++) {

            System.out.println("Hello");
            i++;
            i++;
        }
    }
}
