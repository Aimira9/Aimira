package Arrays1;

public class fruits {

    public static void main(String[] args) {

        String[] fruit1={"banana","apple","orange"}; //banana carrot ,banana tomato,banana apple ,banan potato
        String[] fruit2={"carrot","tomato","apple","potato"};//apple carrot,apple tomato ,apple=apple it will print out
         // apple orange -not print out
        for(int i=0;i<fruit1.length;i++) {
            boolean found=false;
            for(int i2=0;i2<fruit2.length;i2++){
                if(fruit1[i]==fruit2[i2]) {
                    // for(int i=0;i<fruit1.length;i++) {
                    //for(int k=0;k<fruit2.length;k++){
                    //if (fruit1[i].equals(fruit2[k])) {
                    //System.out.println(fruit1[i])

                    System.out.println(fruit1[i]+" is in there !");
                    found=true;
                }
            }
            if(found==false) {
                System.out.println(fruit1[i]+" is not there !");
            }
        }
    }
}
