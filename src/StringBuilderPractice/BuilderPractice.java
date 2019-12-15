package StringBuilderPractice;

public class BuilderPractice {

    public void CheckBuilder(StringBuilder builder) {

        StringBuilder bl = new StringBuilder();

        for(int i=0;i<builder.length();i++) {

            char letter=builder.charAt(i);
            if(letter>='d' && letter <='g') {

                bl.append(letter);
            }

        } bl.replace(2,4 ,"SS");
        System.out.println(bl);
    }
    public static void main(String[] args) {
        BuilderPractice pr=new BuilderPractice();
        pr.CheckBuilder(new StringBuilder("gf5jsdhkesbj4gsd5jkfs"));

    }
}
