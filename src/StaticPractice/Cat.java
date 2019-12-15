package StaticPractice;

public class Cat {

    static  int meowMix=10;
    int kitKat=8; //instance variables is not static

    //create one method will take int number
    //this method is called eatMix
    //once i call the method it will reduce number of
    //meoMIx ,,return type is boolean

    //create one method it will take one int number in parameter
    //method is called eatKit
    //once i call the method it will reduce number of kitKat
    //return type is boolean

    public static boolean eatMix(int amount)  {


        //eatMix(4);
        if(amount<=meowMix) {
            meowMix-=amount;
            System.out.println("The meoMix amount is "+meowMix);
            return true;
        }
        return false;
    }
    public boolean eatKit(int amount) {
        eatMix(1);

        if(amount<=kitKat) {
            kitKat-=amount;
            System.out.println(kitKat);
            return true;
        }
        return false;
    }

}
