package ConstructorPractice;

public class SoccerPlayer {

    String name;
    int age;
    String nationality;
    String team;
    int height;
    int weight;

    public SoccerPlayer() {
        
    }
    public SoccerPlayer(String name) {
        this.name=name;
    }
    public SoccerPlayer(String sname,int sage,String snational,String steam,int sheight,int sweight) {
        name=sname;
        age=sage;
        nationality=snational;
        team=steam;
        height=sheight;
        weight=sweight;

    }

    public void run() {
        System.out.println("Soccer player is running");
    }
    public void isRunning(String name){
        run();
        System.out.println(name+"is running");


    }
    public void shoot() {
        System.out.println("soccer player kicking the ball");
    }
    public void shoot(int speed) {
        System.out.println("the speed of the shoot is"+speed);
    }
    public void shoot(int speed,int distance) {
        shoot();
        if (speed>50 && distance<25) {
            System.out.println("it is goal");

        }else  {
            System.out.println("it is not goal");
        }

    }

    public static void main(String[] args) {
        SoccerPlayer sp=new SoccerPlayer();
        sp.name="kira";
        sp.age=25;
        sp.nationality="spanish";
        sp.team="hello";
        sp.height=165;
        sp.weight=55;

        sp.run();
        sp.isRunning(sp.name);

        sp.shoot(60);
        sp.shoot(55 ,20);

        SoccerPlayer player1=new SoccerPlayer("Messi",32,"Argentina","Barcelona",180,85);
        System.out.println(player1.name);
        System.out.println(player1.team);

        SoccerPlayer player2=new SoccerPlayer("Eden Hazard", 29,"Belgium","Real Madrid",120,85);
        System.out.println(player2.name);
        System.out.println(player2.team);
        System.out.println(player2.nationality);
        System.out.println(player2.team);
        System.out.println(player2.height);
        System.out.println(player2.weight);


        new SoccerPlayer() ;//anonymous

        System.out.println(player2.name);

        SoccerPlayer [] soccerPlayers={new SoccerPlayer(),new SoccerPlayer(),player2,player1};

        System.out.println(soccerPlayers[2].name);


        SoccerPlayer name=new SoccerPlayer("Maradonna");
        SoccerPlayer name1=new SoccerPlayer("Maradonna");
        System.out.println(name==name1); //false
        System.out.println(name.equals(name1)); //false

        SoccerPlayer name2=name;
        System.out.println(name2==name); // true
        System.out.println(name2.equals(name)); //true


}

}
