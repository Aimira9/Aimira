package ProjectDayTestPractice;

public class TestProjectHello {
    public static void main(String[] args) {

        String name="Gulnara";
        //h1e1
        //0+1 ,1+1
        // ello
        name.toLowerCase();
        //get the first char

        String result="";
        int count=1;
        for(int i=0;i<name.length();i++) {

            char letter=name.charAt(i);
            count=1;
            for(int i1=i+1;i1<name.length();i1++) {

                if (name.charAt(i1)==letter) {
                    count++;
                }
            }

            result+=letter+""+count;
            name=name.replace(""+name.charAt(i), "");
            i=-1;
        }
        System.out.println(result);
    }
}
