package AbstractionOOP;

public class campusStudent  extends  Student { //this is concrete class

    @Override
    public void study(){
        System.out.println("Campus student is studying");
    }
    @Override
    public void attendClass(){ //default access modif
        System.out.println("student is taking class on campus"); //implementing
    }

    @Override
    public  void homework(){
        System.out.println("campus student is doing her hw"); //override
    }



}
