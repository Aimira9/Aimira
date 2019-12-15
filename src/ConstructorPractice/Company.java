package ConstructorPractice;

public class Company {
    String name;
    String location;
    String area;
    int employerName;
    int budget;

    //create constructor with no argument

    public Company() {

    }
    //create 3argument constructor and initialize the values for
    public Company(String name,String location,String area) {

        this.name=name;
        this.location=location;
        this.area=area;  //this is constructor
    }
    //create constructor to initialize all the instance variables

    public Company(String name,String location,String area,int employerName,int budget) {

        this(name,location,area);//calling the constructor inside another constructor
        //from previous constructor

        this.name=name;
        this.location=location;
        this.area=area;
        this.employerName=employerName;
        this.budget=budget;
    }
    //you can not create same constructor again

    public void displayCompanyInfo() {
        System.out.println("Company name " +name);
        System.out.println("Company location" +location);
        System.out.println("company area is " +area);
        System.out.println("Employers number is " +employerName);
        System.out.println("Budget is " +budget);
    }

    public static void main(String[] args) {
        Company company=new Company();
        Company company1=new Company("Zara" ,"Scaumburg","Retail");
        System.out.println(company1.name);
        System.out.println(company1.employerName);
        company1.employerName=50;
        System.out.println(company1.employerName);

        Company company2=new Company("Chase","Chicago","Finance",400,200000);
        System.out.println(company2.area);

        company2.displayCompanyInfo();


    }
}
