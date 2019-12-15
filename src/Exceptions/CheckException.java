package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader; //input output
import java.io.IOException;

public class CheckException {

    public static void main(String[] args) {

        String filePath="src/Exceptions/File.txt";  //File= no such file or directory

        //FileReader-> throwing FileNotFoundException
        //readLine() -> throwing IOException(super class)
        //Throwable -> Exception -> IOException -> FileNotFoundException

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader reader1=new BufferedReader(reader);

            String line=reader1.readLine(); //readLine =is IOException
            String line2=reader1.readLine();

            System.out.println(line);
            System.out.println(line2);

            String line3=reader1.readLine();
            System.out.println(line3); //null


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("there is an Exception");

        }catch (Exception e) {
            System.out.println("this is IOException ");

        }finally {
            System.out.println("i am finally block "); //will executed anytime in the end

        }


    }
}
