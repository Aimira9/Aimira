package ConstructorPractice;

public class ComputerTest {

    public static void main(String[] args) {

        ComputerClass c= new ComputerClass(); // i called no argument constructor
        ComputerClass c1=new ComputerClass("Apple", "OS" ,"MacBook","Pro");

        //immutable class
        //my instance variables should be private
        //i need to create only getters
        //we need set the value using the constructor

        
        //System.out.println(c1.name); -this is private

        ComputerClass c2=new ComputerClass(2015,8,13);
        System.out.println(c2.memory);
        System.out.println(c2.memory);

        c.memory=12;
        System.out.println(c.memory);


        System.out.println("===============");

        //create the array store the computers c c1 c2
        //print the memory for all computer from array

        ComputerClass comList[]={c,c1,c2} ; //if i have more computer i need loop
        for(ComputerClass cc:comList) {
            System.out.println(" it is from for each loop  "+ cc.memory);

        }

        //System.out.println(cc[0].memory);
        //12
        //System.out.println(c1.memory); //15
        //System.out.println(c2.memory); //8






    }
}
