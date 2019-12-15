package StringBuilderPractice;

public class Practice {

   // String[] str = {"tech", "2019", "coding"};

    public String name(String[] name) {

        String result = "";
        for (String n : name) {
            result += n;
        }
        return result;
    }

    public static void main(String[] args) {

        Practice pr=new Practice();
        String [] ai={"tech", "2019", "coding"};
        System.out.println(pr.name(ai));
    }
}
