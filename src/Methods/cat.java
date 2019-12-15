package Methods;

public class cat {
    //it has 5 diffrernt attributes-instance variables
    //(name .age,color,boolean isRunning ,kind)

    //create one method name start() -->it will make isRunning-true
    //create one method name stop() -->it will make isRunning -false
    //create one method name run(String direction)-->it will print which direction your cat is running
    //create one method to print all the cat inf
    //create one method to accelerate speed of your cat-it will take one parameter as an TargetSpeed and it will print all accelation speed
    //1-cur speed
    //5-target speed   =====1 2 3 4 5
    //create one method to slowdown your cat
    //5--current speed
    //1--target speed to slow --- 5 4 3 2 1
    String name;
    int age;
    String color;
    boolean isRunning;
    String kind;
    int speed;

    public boolean start() {
        isRunning = true;
        return isRunning;
    }

    public boolean stop() {
        isRunning = false;
        return isRunning;

    }

    public String run(String direction) {
        return direction;
    }

    public void run(String direction,int distance) {
        System.out.println("The cat direction is "+direction+"" +
                "the running distance is " +distance);
    }

    public void info() {
        System.out.println("Your name is" + name);
        System.out.println("Age is " + age);
        System.out.println("Color is" + color);
        System.out.println("Cat is running " + isRunning);
        System.out.println("Your kind is" + kind);
        System.out.println("Speed is " + speed);

    }

    public void accelerate(int target) {

        while (speed < target) {
            System.out.print(speed); // 0 1 2 3 4 5 6
            speed++;
        }
    }

    //current speed 6 --target speed 3
    public void slowDown(int targetspeed) {
        while (speed >= targetspeed) {
            System.out.print(speed);
            speed--;

        }

    }

    public static void main(String[] args) {
        cat cat1 = new cat();

        cat1.name = "Kira";
        cat1.age = 3;
        cat1.color = "pink";
        cat1.kind = "good";

        cat1.info();
        cat1.start();
        cat1.stop();

        System.out.println("kira is running  " + cat1.run("right"));
        System.out.println("is my cat running" + cat1.stop());
        cat1.accelerate(8);
        System.out.println();
        cat1.slowDown(1);
    }


}
