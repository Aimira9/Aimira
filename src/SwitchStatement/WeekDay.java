package SwitchStatement;

public class WeekDay {

    public static void main(String[] args) {

        int num=4;
        switch (num ) {

            case 1 : case 2: case 3 : case 4 : case 5:
                System.out.println("Weekdays");
                break;
            case 6: case 7:
                System.out.println("weekends");
                break;

        }
    }
}

