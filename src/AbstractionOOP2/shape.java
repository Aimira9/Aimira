package AbstractionOOP2;

public abstract class shape extends SuperShape {

    String name;
    double area;

    public shape(String name) {
        this.name=name;
    }

    public abstract  double calculateArea(); //abstract method

    protected abstract void draw(); //abstract

    @Override
    public void superDraw() {
        System.out.println("i am from SuperShape class"); //override method from supershape class
    }

}
