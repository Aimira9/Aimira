package Methods;

public class GetGreates {

    //create a method that will accept 3 int num
    //and this method will return the greatest number as int

    public int getGreatest(int a,int b, int c) {
        if(a>b && a>c) {
            return  a;

        }else if(b>a && b>c) {
            return  b;

        }else if(c>a &&c>b) {
            return c;

        }else{
            return -1;
        }
    }
}
