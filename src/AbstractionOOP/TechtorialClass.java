package AbstractionOOP;

public class TechtorialClass {

    public static void main(String[] args) {

        //Student student=new Student() ;
        //we can not Instantiate (create an object)abstract class
        campusStudent cs=new campusStudent();
        cs.attendClass();

        System.out.println("=============");

        OnlineStudent os=new OnlineStudent();
        os.attendClass();
        os.homework(); //from student class

    }
}
