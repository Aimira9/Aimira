package InterfaceOOP;

public interface Store  {

    //ALL variables of interface are
    //public static and final
    //public static final int capacity
    //WE can have abstract methods

    int CAPACITY=20; //variable

    //public abstract void sellItem();
    void sellItem ();  //default //public abstract //no return type =void

    int countEmployees(); //method

    default void displayItem() {
        System.out.println("displaying item in store interface");

    }


}
