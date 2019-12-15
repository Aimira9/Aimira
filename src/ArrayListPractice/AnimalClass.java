package ArrayListPractice;

public class AnimalClass {

    String name,area;
    int age,daylyMeal;


    public AnimalClass(){

    }
    public AnimalClass(String name, int age,String area,int daylyMeal) {
        this.name=name;
        this.age=age;
        this.area=area;
        this.daylyMeal=daylyMeal;

    }
    public  void Increase () {
        daylyMeal += 10;
    }
}
