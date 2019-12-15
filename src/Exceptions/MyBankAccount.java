package Exceptions;

public class MyBankAccount {

    public void transaction(int amount ) throws Exception{
        System.out.println("your transaction is over the balance ");
        throw new Exception("your transaction is over the balance ");
    }

    public void deposit(int amount ) throws NullPointerException {
        System.out.println("your deposit amount is less than 10$");
        throw new NullPointerException("your deposit amount is less than 10$");
    }

    public void withDraw(int amount) throws Exception {
        System.out.println("you are withdrawing more than your balance");
        throw new RuntimeException("you are withdrawing more than your balance");
    }
}
