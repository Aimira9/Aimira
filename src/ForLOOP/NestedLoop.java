package ForLOOP;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i=0;i<5;i++) { //0 1 2 3 4 5

            for (int k=0;k<4;k++) { //0 //1 //2 //3 //4

                System.out.print(i+"-"+k+",");
                //0-0 ,0-1  ,0-2 , 0-3
                // 1-0, 1-1 1-2, 1-3
                //2-0 ,2-1 ,2-2, 2-3
                //3-0, 3-1, 3-2, 3-3
                //4-0,4-1 ,4-2, 4-3
            }
        }

    }
}
