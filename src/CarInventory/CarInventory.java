package CarInventory;

import java.util.ArrayList;

public class CarInventory {

    private String dealerName;

    public CarInventory(String dealerName) {
        this.dealerName=dealerName;


    }

    public void getCarName(ArrayList <Car> carList) {
        for(Car c:carList) {
            System.out.println(c.getName());
        }
    }





    //create one method to print vinnumbers of the car
    public void getVinNumber(ArrayList <Car> carList) {
        for (Car c : carList) {
            System.out.println(c.getVinNumber());

        }
    }
    public void getPrice(ArrayList <Car> carList) {
        for (Car c : carList) {
            System.out.println(c.getPrice());
        }
    }
    public void setModelYear(ArrayList<Car> carsList,String vinNumber,int year) {
        for (int i = 0; i < carsList.size(); i++) {
            if (carsList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)) {
                carsList.get(i).setYear(year);
            }
        }
    }
        public void getModelYear(ArrayList <Car> carsList) {
            for (Car c : carsList) {
                System.out.println(c.getYear());
            }
        }
    public void changePrice(ArrayList<Car> carsList,String vinNumber,int price) {
        for (int i = 0; i < carsList.size(); i++) {
            if (carsList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)) {
                carsList.get(i).setPrice(price);
            }
        }

        }
        //it will add the car to our ArrayList if car is not available in our inventory
        public void addNewCar (ArrayList<Car> carsList, Car newCar) {
        boolean  hasCar=false;
        for(Car c:carsList) {
           if( c.getVinNumber().equalsIgnoreCase(newCar.getVinNumber())) {

              hasCar=true;
           }
        }
        if(!hasCar){
            carsList.add(newCar);
            //System.out.println();
            System.out.println("new car added to your inventory");
        }
    }

    public void removeCar(ArrayList <Car> carList,String vinNumber) {

        //boolean hasCar=false;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)) {
                carList.remove(carList.get(i));
            }
        }
    }
    public static void main(String[] args) {

        Car car1=new Car("Toyota", "Corolla", 2016, 10000, "12i344");
        Car car2=new Car("Mercedes", "C 300", 2017, 16000, "1674j5844");
        Car car3=new Car("Ford", "malibu", 2010, 5000, "1237ds45844");
        Car car4=new Car("Toyota", "Camry", 2009, 8000, "6547vc44");
        Car car5=new Car("BMW", "X6", 2014, 25000, "39554344");
        Car car6=new Car("Porche", "Panamera", 2018, 50000, "7548344");
        Car car7=new Car("Porche", "Panamera", 2018, 50000, "7548364");

        //create inventory dealer and give the name
        CarInventory dealer=new CarInventory("AutoNation");

        ArrayList <Car> carList=new ArrayList<Car>();
        carList.add(car1);
        carList.add(car5);

        dealer.getCarName(carList);
        dealer.getVinNumber(carList);
        dealer.getPrice(carList);
        dealer.setModelYear(carList,"16745844",2015);
        dealer.getModelYear(carList);
        dealer.changePrice(carList,"16745844",20000);
        dealer.getPrice(carList);
        dealer.addNewCar(carList,car2);
        dealer.addNewCar(carList,car2);
        dealer.addNewCar(carList,car6);

        dealer.getCarName(carList);

        dealer.removeCar(carList,"12i344");

        System.out.println("this list is after removing the car");

        dealer.getCarName(carList);




    }
}

