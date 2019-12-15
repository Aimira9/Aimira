package CollectionPractice;

public class flowerTest {

    public static void main(String[] args) {

        flower fl1=new flower("rose",232);

        fl1.addFlower("tulip",64);
        fl1.addFlower("red tulip",765);
        fl1.addFlower("blue tulip",7634);
        fl1.addFlower("pink tulip",567);

        int tulipBarc=fl1.findFlower("tulip");
        System.out.println(tulipBarc);

        String flowerName=fl1.findFlower(64);
        System.out.println(flowerName);
        System.out.println("list of flower");

        fl1.printNames();

        fl1.removeFlower("pink tulip");


    }
}
