package AbstractionOOP2;

public class circle extends  shape{ //option/return
    int radius;


    public circle(String name) {
        super(name);
    }

    @Override
    public double calculateArea() {
        return radius*radius*3.14;
    }

    @Override
    protected void draw() {
        System.out.println("i am drawing circle");

    }
}
