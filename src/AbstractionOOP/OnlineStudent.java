package AbstractionOOP;

public class OnlineStudent extends Student {
    //option /return for implement


    @Override
    public void study() {
        System.out.println("online student is studying harder than campus student");

    }

    @Override
    void attendClass() {
        System.out.println("they are attending through webinar");

    }

}
