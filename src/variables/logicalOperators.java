package variables;

public class logicalOperators {

    public static void main(String[] args) {



        boolean hasTicket=false;
        boolean hasVisa=true;

        boolean canCome=hasVisa&&hasTicket;
        System.out.println("can i come to USA ?" +canCome);


        boolean finishedESL=false;
        int toeflScore=80;

        boolean canGoTOCollege=finishedESL || toeflScore >=79;
        System.out.println("Can go to school?" +canGoTOCollege);




        //To be able to buy the home I should have enough money or
        //I should have a mortgage
        // current money is 200.000
        //home price 300.000

        int currentMoney=200_000;
        int homePrice=300_000;

        boolean hasMortgage=true;
        //or
        boolean hasEnoughMoney=currentMoney>=homePrice; //false

        boolean canBuyHome=hasMortgage || hasEnoughMoney;

        System.out.println("can I buy home?" +canBuyHome);





        //I should have driver license
        //age 16
        //should pass the exam
        //my score is 70
        //expected 75
        //I should have visa

        int myAGe=20;
        int expectedAge=16;

        boolean ageRequirement=myAGe>=expectedAge; //true

        int myScore=80;
        int expectedScore=75;

        boolean passExam=myScore>=expectedScore;

        boolean hasVisa1=true;
        //age
        //score
        //visa
        //

        boolean canGetDriverLicence=ageRequirement && passExam && hasVisa1;

        System.out.println("Can I get the driver license " +canGetDriverLicence);

        boolean a =true;
        System.out.println(!a);












    }
}
