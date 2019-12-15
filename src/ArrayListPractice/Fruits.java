package ArrayListPractice;
import java.util.ArrayList;
import java.util.Scanner;
    public class Fruits {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            ArrayList <String> fruitsList=new ArrayList();
            //if you do not specify the data type for your arrayList
            //it will  store every element as a object
            System.out.println("Provide fruits?");
            int count=5;
            for(int i=0;i<5;i++){
                fruitsList.add(input.nextLine());
                count--;
                System.out.println(count+ "times you can enter fruits");
            }
            System.out.println(fruitsList);

            //make all fruits upper case
            //for loop ,get()method,uppercase(),set()

          for(int i=0;i<fruitsList.size();i++) {

              fruitsList.set(i,fruitsList.get(i).toUpperCase());

          }
            System.out.println(fruitsList);

          for(int i=0;i<fruitsList.size();i++) {

              if (fruitsList.get(i).startsWith("B")) {

                  System.out.println(fruitsList.get(i));
              }
          }
        }
    }

