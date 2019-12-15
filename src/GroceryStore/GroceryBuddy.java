package GroceryStore;

public class GroceryBuddy extends CheckOut {

    String[] fruits = {"Apple", "Orange", " Watermelon", "Banana", "Pineapple", "Grape", "Mango", "Strawberry", "Peach", "Cherry"};
    String[] vegetables = {"Carrots", "Broccoli", "Onion", "Potato", "Tomato", "Cucumber", "Corn", " Bean", "Spinach", "Pepper"};
    String[] products = {"Milk", "Bread", "Beef", "Eggs", "Chicken", "Sugar", "Salt", "Coffee", "Rice", "Pasta"};

    double[] fruitPrices = {2.34, 3.45, 6.45, 7.80, 2.45, 1.99, 2.76, 3.78, 3.67, 2.65};
    double[] vegetablePrices = {3.34, 4.45, 1.45, 2.80, 4.45, 5.99, 6.76, 1.78, 2.67, 3.65};
    double[] productPrices = {4.34, 9.45, 1.45, 2.80, 3.45, 4.99, 5.76, 1.78, 8.67, 9.65};

    public void printFruits() {
        for (String fr : fruits) {
            System.out.println(fr);
        }
    }

    public void printVegetables() {
        for (String vegie : vegetables) {
            System.out.println(vegie);
        }
    }

    public void printProducts() {
        for (String pr : products) {
            System.out.println(pr);
        }
    }

    public double getPrice(String productName) {
        double price = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(productName)) {
                price = fruitPrices[i];

            }
        }
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i].equalsIgnoreCase(productName)) {
                price = vegetablePrices[i];

            }
        }

        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(productName)) {
                price = productPrices[i];
            }

        }return price;
    }
}


