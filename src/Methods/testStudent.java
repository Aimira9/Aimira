package Methods;

public class testStudent {
    public static void main(String[] args) {


        student student = new student();
        System.out.println(student.age);

        student.age=22;

        System.out.println(student.age);

        student.study();
        student.study(5);
        student.study("Aimira");

    }
}
