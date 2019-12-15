package Arrays1;

public class wordLength {
    public static void main(String[] args) {

        String[] names = {"Erick", "John", "Patel", "Kira", "Kubat", "Aimira", "Nina"};

        for (int i=0; i < names.length; i++) {

            if(names[i].length()==4){
                System.out.println(names[i]);
            }


        }
    }


}
