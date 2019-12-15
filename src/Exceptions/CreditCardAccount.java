package Exceptions;

public class CreditCardAccount  extends MyBankAccount{

    @Override
    public void transaction(int amount) throws Exception{
        System.out.println("you are crossing credit card limit");
        throw new Exception("you are crossing credit card limit");

    }
    @Override
    public void deposit(int amount ) throws NullPointerException{
        System.out.println("paying off my balance");

    }
    @Override
    public void withDraw(int amount) throws RuntimeException{
        System.out.println("i am withdrawing money.");
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
