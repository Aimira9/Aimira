package StaticPractice;

public class CatTest {

    public static void main(String[] args) {

        Cat dodo=new Cat();
        Cat prenses=new Cat();

        System.out.println(dodo.kitKat); //8
        System.out.println(prenses.kitKat); //8
        System.out.println(Cat.meowMix); //is static //10

        //dodo eat 2kg meoMix
        //class name is Cat
        Cat.eatMix(2); //static //8
       Cat.eatMix(8);  //0

        dodo.eatKit(6); //for dodo left is 2
        //System.out.println(dodo.kitKat);//2
        prenses.eatKit(5); //3
        //prenses.eatMix(2);
    }
}
