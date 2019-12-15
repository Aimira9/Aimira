package ScannerPackage;

import java.util.Scanner;

public class ExamResult {

    public static void main(String[] args) {


        //you need enter 3 different exam result   70,45,90
        //if average is equals to 70 or more than 70
        //the student should attend all the classes   true false
        //student should complete at least 6 assignment  5
        //student able to g oto next semester or not



        Scanner input=new Scanner (System.in);

        System.out.println("What's your exam result ?");

        int exam1=input.nextInt();
        int exam2=input.nextInt();
        int exam3=input.nextInt();

        int averageScore=(exam1+exam2+exam3)/3;

        System.out.println("Average score is" +averageScore);

        System.out.println("student attended all the classes  ");
        boolean attended =input.nextBoolean();
        
        System.out.println("Completed Assignment");

        int completedAssignment=input.nextInt();

       boolean result= averageScore>=70 &&  attended==true && completedAssignment>=6;
        System.out.println("Can student take classes from next semester?" +result);















    }
}
