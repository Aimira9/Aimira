package ConstructorPractice;

public class StringEqualPractice {

    public static void main(String[] args) {


        String student="David";
        String student1="David";
        String student3="David";

        System.out.println(student==student1); //true

        String student2=new String("David");

        System.out.println(student==student2); //false

        student=student2;
        System.out.println(student==student2); //true

        student1=student1+""; //--> it is creating new object and it is inside the stringpool but its different value
        System.out.println(student1==student3); //false

        System.out.println(student3=="Da" + "vid"); //true




    }
}
