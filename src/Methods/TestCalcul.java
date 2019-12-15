package Methods;

public class TestCalcul {

    public static void main(String[] args) {
        calcul c=new calcul(); //c-object name //calcul -class name
        //new calcul()-creating an object
        System.out.println(c.sum(100,100));
        System.out.println(c.subtract(12,5)); //-
        System.out.println(c.multiply(5,5)); //*
        System.out.println(c.division(20,5));
        System.out.println(c.remainder(12,5));//false
        //10,2=true


        System.out.println("-------------------------");


        System.out.println(c.calculator(10,5,"2"));


        System.out.println(c.calculator(12,5 ,"%"));
    }


    }

