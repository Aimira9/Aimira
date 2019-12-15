package Arrays1;

public class StringArrays {
    public static void main(String[] args) {

        //we have two ways creating of array


        String[] words=new String[5];

        words[0]="java";
        words[1]="programming";
        words[2]="language";
        words[3]=" I ";
        words[4]="love"; //null

        for(int i=0;i<words.length;i++){

            System.out.println(words[i]);
        }
        System.out.println("----------------------");

        //for each loop
        for (String word:words) {

            System.out.println(word);
        }
        System.out.println("------------------");
        int []nums={100,300,44,32,9,3};

        for (int n:nums){
            System.out.println(n);
        }





    }
}
