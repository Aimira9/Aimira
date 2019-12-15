package ForLOOP;

public class hw2CatMeal {

    public static void main(String[] args) {


        double catOneDay=3*0.5; // 1.5, 4 48.57 45.5

        int count=1;

        for(double i=50; i>0 ; i-=catOneDay) {

            System.out.println("You can use this meal "+count +" days");

            count++;

        }

    }
}
