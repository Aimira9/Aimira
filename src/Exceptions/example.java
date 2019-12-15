package Exceptions;

import java.io.IOException;

public class example {

    public static void main(String[] args) throws Throwable,Exception,InterruptedException, IOException {

        WebBrowser webBrowser=new WebBrowser();
        webBrowser.sleep(2);
        webBrowser.readFile("src/Exceptions/myFile.txt");

          try {
              throw new Exception();
          } catch (Exception e) {
              System.out.println("there is an exception");
          }

        System.out.println("=========");
          testNumber(1);
          error();
        System.out.println("i am done with main method");
    }

    public static void testNumber(int num) throws Exception {
        if(num<0){
            throw  new Exception("number is negative ");
        }
        System.out.println("this number is positive ");
    }

    public static void error() throws Throwable {

    }
}
