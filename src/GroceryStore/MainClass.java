package GroceryStore;

import java.util.Scanner;

public class MainClass extends GroceryList {

    public static  void instructions(){
        System.out.println("\t 0 - To Print Grocery Menu. ");
        System.out.println("\t 1 - To print choice options. ");
        System.out.println("\t 2 - To print the list of grocery items. ");
        System.out.println("\t 3 - To add an item to the list. ");
        System.out.println("\t 4 - To modify an item in the list. ");
        System.out.println("\t 5 - To remove an item from the list. ");
        System.out.println("\t 6 - To search for an item in the list. ");
        System.out.println("\t 7 - To check out the cart");
        System.out.println("\t 8 - To Payment");
        System.out.println("\t 9 - To quit the application.");
    }
    public void printGroceries() {
        printVegetables();
        printFruits();
        printProducts();
    }
    public void addItem(){
        Scanner input=new Scanner(System.in);
        addToCart(input.nextLine());
    }
    public void modify() {
        System.out.println("please select item you would like to remove");
        System.out.println("please select item you would like to add ");
        replace(inputs.nextLine(),inputs.nextLine());
    }
    public void removeItem() {
        remove(inputs.nextLine());
    }
    public void checkOut() {
        purchaseList();
        totalPrice();
    }
    public void grandTotal() {
        double grandTotal=totalPrice()+6.99;
        paymentOption(inputs.nextLine());
    }
    public void searchItem(String productName) {
        if(findItem(productName)>=0){
            System.out.println(productName+"is on the list");
        }else {
            System.out.println(productName+"is not in the list");
        }

    }

    public static void main(String[] args) {

        MainClass mc=new MainClass();
        Scanner input=new Scanner(System.in);
        boolean bl=true;
        while (bl){

            System.out.println("Please select option");
            instructions();
            switch (input.nextInt()) {

                case 0:mc.printGroceries(); break;
                case 1:
                case 2:
                    System.out.println(mc.cart);
                case 3:mc.addItem();
                break;
                case 4:mc.modify();
                break;
                case 5:mc.removeItem();
                break;
                case 6:mc.searchItem(input.nextLine());break;
                case 7:mc.checkOut();
                break;
                case 8:mc.paymentOption(input.nextLine());break;
                case 9:bl=false;
                    System.out.println("Please come back again ");
                    break;


            }
        }
    }
}
