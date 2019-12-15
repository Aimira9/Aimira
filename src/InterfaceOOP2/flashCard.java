package InterfaceOOP2;

public interface flashCard extends faceRecognition{

    //PUBLIC STATIC FINAL IN SIZE=128;
    int SIZE=128;


    //public abstract void location;
    void location();

    default void regularMethod(){
        System.out.println("regular method from flashcard interface");
    }

    static void staticMethod() {
        System.out.println("static method from flashcard interface");
    }


}
