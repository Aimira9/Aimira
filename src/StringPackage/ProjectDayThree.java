package StringPackage;

import java.util.Scanner;

public class ProjectDayThree {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);





        System.out.println("What's your name?");
        String name =input.nextLine();

        System.out.println("What's your state code");
        String stateCode =input.nextLine();

        System.out.println("What's your city?");
        String city =input.nextLine();

        System.out.println("What's your gender");
        String gender =input.nextLine();
        System.out.println("How old are you?");
        int age =input.nextInt();

        boolean checkAge= age >=18;
        boolean checkName=name.charAt(0)=='A'&&name.charAt(name.length()-1)=='V';
        boolean checkstateCode=stateCode.charAt(0)=='I';
        boolean checkStateCode2=stateCode.charAt(name.length()-1)==('L');
        boolean checkCitylength=city.length()<=10;
        boolean checkGender=gender.charAt(0)=='M';

        boolean together=checkAge&&checkName&&checkstateCode&&checkStateCode2&&checkCitylength&&checkGender;


        System.out.println("am i able to vote " +together);
















    }
}
