package Methods;

public class ArrayMethod {

    String studentName;
    String[] students=new String[5]; //our array
    int count;

    public void addStudent() {   //first method
        students[count]=studentName;
        count++;
    }
    public void printNames() {   //second method
        for(String name:students){
            System.out.println(name); //print out each name
        }
    }
}
