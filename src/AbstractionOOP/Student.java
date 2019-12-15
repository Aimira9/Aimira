package AbstractionOOP;

public  abstract class Student { //only public ,,,no private ,, no final

    int studentId;
    String studentName;

    public abstract void study(); //no body in abstract

    abstract void attendClass();

    public  void homework() {
        System.out.println("i have to do my hw before coming to class !");
    }

}
