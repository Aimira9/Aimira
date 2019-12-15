package CarInventory;

public class Song {

    private String title;
    private double duration;
    private String singerWriterName;


    public Song(){
    }


    public Song(String title, double duration, String singerWriterName){
        this.title=title;
        this.duration=duration;
        this.singerWriterName=singerWriterName;
    }
    static Song song1=new Song("Black and White",3.16,"AimiraU");
    static Song song2=new Song("The wheels on the Bus",2.50,"KiraS");
    static Song song3=new Song("ChocoPie",3.40,"AU");
    static Song song4=new Song("Hello.Buy",7.89,"KL");
    static Song song5=new Song("Love.Happines",3.60,"Ciara");


    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public double getDuration(){
        return duration;
    }
    public void setDuration(double duration){
        this.duration=duration;
    }
    public String getSingerWriterName(){
        return singerWriterName;
    }
    public void setSingerWriterName(String writerName){
        this.singerWriterName=singerWriterName;
    }
}
