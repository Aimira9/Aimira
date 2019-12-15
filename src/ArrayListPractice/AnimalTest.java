package ArrayListPractice;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {

         //AnimalClass anim=new AnimalClass();
        AnimalClass anim1=new AnimalClass("Cow",1,"Chicago",5);
        AnimalClass anim2=new AnimalClass("tiger",2,"Florida",6);
        AnimalClass anim3=new AnimalClass("Cat",3,"Miami",7);
        AnimalClass anim4=new AnimalClass("lion",4,"LA",9);
        AnimalClass anim5=new AnimalClass("horse",5,"Chicago",8);

        System.out.println(anim5.daylyMeal);

        ArrayList <AnimalClass> animalList=new ArrayList<>();

        animalList.add(anim1);
        animalList.add(anim2);
        animalList.add(anim3);
        animalList.add(anim4);
        animalList.add(anim5);




        for(int i=0;i<animalList.size();i++){

            animalList.get(i).Increase();
            System.out.println(animalList.get(i).daylyMeal);
        }









    }
}
