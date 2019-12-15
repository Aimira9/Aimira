package StringPackage;

public class ProjectDayThree3 {

    public static void main(String[] args) {

        int a=24;
        int b=33;

        int total=a++ + ++a + --b +  ++b + b++ +a +++b---b+a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(total);
    }
}
