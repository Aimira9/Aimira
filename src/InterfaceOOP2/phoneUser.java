package InterfaceOOP2;

public class phoneUser {

    public static void main(String[] args) {
        Iphone iphone=new Iphone(); //from phone class
        iphone.call();
        iphone.takePicture();
        iphone.text();

        System.out.println("===================");

        Samsung samsung=new Samsung(); //from non argument constructor
        samsung.location();
        samsung.faceId();


    }
}
