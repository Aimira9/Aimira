package ConstructorPractice;

public class getterSetter {

    private String name;
    private String operatingSystem;
    private String brand;
    private String model;

    public String getName () {
        return name;
    }

    public void setName(String name) {
    this.name=name;
}
  public String getOperatingSystem() {

    return operatingSystem;
    }
    public void setOperatingSystem (String operatingSystem) {
        this.operatingSystem=operatingSystem;
    }
    public String getBrand() {
        return  brand;
    }
    public void setBrand(String brand) {
        this.brand=brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model=model;
    }

    public static void main(String[] args) {
        getterSetter gs=new getterSetter();
        System.out.println(gs.getName()); //null
        gs.setName("HP");
        System.out.println(gs.getName());
        gs.setName("Asus");
    }
}
