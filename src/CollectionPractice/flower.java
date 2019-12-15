package CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class flower {

    String names;
    int barcodeNum;
    HashSet<flower> flowersList; //storing the object

    public flower(String names, int barcodeNum){
        this.names=names;
        this.barcodeNum=barcodeNum;
        flowersList=new HashSet<>(); //initialize
    }

    public void addFlower(String name,int barcodeNum){
        flowersList.add(new flower(name,barcodeNum));
    }
    public int findFlower(String name) {
        for(flower fl:flowersList) {
            if (fl.names.equalsIgnoreCase(name)){
                return fl.barcodeNum;
            }
        }
        System.out.println("This flower is not available");
        return 0;
    }
    public String findFlower(int barcodeNum) {
        for(flower bn:flowersList){
            if(bn.barcodeNum==barcodeNum) {
                return bn.names;
            }
        }
        System.out.println("this flower is not available");
        return null;
    }
    public void removeFlower(String name) {
        ArrayList<flower> flowerstList=new ArrayList<>(flowersList);
        for(int i=0;i<flowerstList.size();i++){

            if(flowerstList.get(i).names.equalsIgnoreCase(name)) {
                flowerstList.remove(flowerstList.get(i));
            }
        }
        flowersList=new HashSet<>(flowerstList);

    }
    public void printNames() {
        for(flower pr:flowersList) {
            System.out.println(pr.names);
        }
        }

    }

