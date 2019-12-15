package Methods;

public class bankAccount {

    String name;
    int accountNum;
    String bankName;
    double balance;
    int expirationDate;

    public void cardInfo () {
        System.out.println("Your name is " + name);
        System.out.println("Your account number is " +accountNum);
        System.out.println("Your bank name is " +bankName);
        System.out.println("Your balance is " +balance);
        System.out.println("Your expiration date is"+expirationDate);
    }
    public double depositAmount(int amount) {
        balance+=amount;
        return balance;


}public double withDraw (int amount) {
        balance-=amount;
        return balance;
    }

    public static void main(String[] args) {
        bankAccount ba=new bankAccount();
        ba.name="Aimira";
        ba.accountNum=4537645;
        ba.bankName="Chase";
        ba.expirationDate=2022;
        ba.balance=10;

        ba.cardInfo();

        System.out.println(ba.depositAmount(1000));
        System.out.println(ba.withDraw(500));

    }

}
