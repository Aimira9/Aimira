package Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        String[] studentsNames={"Erkin","Adilet","Gulnara","Nazire","Aimira","Kira","Sema","Rumeisa"};
        Arrays.sort(studentsNames);
        System.out.println(Arrays.toString(studentsNames));

        Scanner input=new Scanner(System.in);
        String name=input.next();

        for(int i=0;i<studentsNames.length;i++) {

            if(name.equalsIgnoreCase(studentsNames[i])) {
                System.out.println(i);
                break;
            }else if(i==studentsNames.length-1) {
                System.out.println("-1");
                break;
            }
        }
    }
}
