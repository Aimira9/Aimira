package ArslansLesson;

public class MultiplicationTable {

    public static void main(String[] args) {
        //use nested for loop

        for (int i=1;i<=10;i++ ) {

            for(int k=1;k<=10;k++) {

                System.out.println(i+ "*" + k + "=" + k * i);
            }
            System.out.println();
        }
    }
}
