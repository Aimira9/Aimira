package GroceryStore;

import java.util.ArrayList;

public class GroceryList extends GroceryBuddy {
    ArrayList <String>cart = new ArrayList();

    public void addToCart(String product) {
        for (String fruit : fruits) {
            if (fruit.equalsIgnoreCase(product)) {
                cart.add(fruit);
                return;
            }
        }
        for (String veg : vegetables) {
            if (veg.equalsIgnoreCase(product)) {
                cart.add(veg);
                return;
            }
        }
        for (String prod : products) {
            if (prod.equalsIgnoreCase(product)) {
                cart.add(prod);
                return;
            }
        }
        System.out.println("the product invalid");
    }
    public ArrayList purchaseList(){
        return cart;
    }
    public double totalPrice() {
        double sum=0.0;

        for (int i=0;i<cart.size();i++){
            sum+=getPrice(cart.get(i));
        } if(sum>100) {
            sum=sum*0.15;
        }else if (sum>50 && sum<100){
            sum=sum*0.10;
        }return sum;
    }
    public void modify(int position,String newItem) {
        cart.set(position,newItem);

    }
    public void remove(String name){
        cart.remove(name);

    }
    public int findItem(String itemName){
        int position=0;
        position=cart.indexOf(itemName);
        return position;
    }
    public void replace(String currentItem,String newItem) {
        cart.set(findItem(currentItem),newItem);
    }
}
