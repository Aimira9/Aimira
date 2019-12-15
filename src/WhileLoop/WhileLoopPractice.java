package WhileLoop;

public class WhileLoopPractice {
    public static void main(String[] args) {


        int age=20;
        while(age<26) {

            System.out.println(age +"Complete circle ");//1 2 3 4 5 6 times      //20 21 22 23 24 25

            age++;
        }

        //i wanna print my name 5 times
        int repeatNum=5;
        int currentNum=1;
        while (currentNum<=repeatNum) {

            System.out.println(" Aimira ");
            currentNum++;

            
        }
        //40$ in my phone account
        //every call is 5$
        //how many times i can call

        int totalAmount=40;
        int oneCall=5;
        // int restAmount=40; // 40-5  35-5  30-5

        while (totalAmount>0) {

            System.out.println("I can call"); //8 times
            totalAmount=totalAmount-oneCall; //35 30 25 20 15 10 5-5=0


        }

        //u have one PlaTE OF MEAL
        //if u take 10spoon  u finished your meal
        //print every spoon of meal you take
        //1spoon  2spoon

        int spoonNum=1;
        while (spoonNum<=10) {

            System.out.println(spoonNum + " spoon");
            spoonNum++; //1 2 3 4 5 6 7  8 9 10

        }









    }
}
