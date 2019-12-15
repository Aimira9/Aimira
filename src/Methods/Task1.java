package Methods;

public class Task1 {
    //create the method
    //it will take int array as a parameter
    //your method should find the int value more than 3 and less 7

    //int [] number={3,4,1,10,6,5,4,9} ;
    //find sum of this numbers


    public int sum(int  [] number) {
        int result=0;

        for(int i=0;i<number.length;i++) {
            if(number[i]>3 && number[i]<7) {
                result+=number[i];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Task1 ts=new Task1();
        int [] number={3,4,1,10,6,5,4,9}; //4+4+5+6=19
        System.out.println(ts.sum(number));
    }


}
