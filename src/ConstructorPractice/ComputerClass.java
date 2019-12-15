package ConstructorPractice;

public class ComputerClass {


    private  String name;
    private  String operationSystem;
    private  String  brand;
    private  String model;
    private  int year;

   int memory; //if you don't give any access modifier it is default access
    //default =accessible inside same package
    //protected=same package +outside of the package inside subclass
    private  int inch;

    public ComputerClass () {

    }
    public ComputerClass(String sname, String soperationSystem, String sbrand, String smodel) {
        name=sname;
       operationSystem=soperationSystem;
       brand=sbrand;
       model=smodel;

    }
    public ComputerClass(int syear,int smemory,int sinch) {
        year=syear;
        memory=smemory;
        inch=sinch;

    }
    //to be able to call the constructor inside another constructor we are using THIS constructor
    //it should be in first line

    public ComputerClass(String sname, String soperationSystem, String sbrand, String smodel,int syear,int smemory,int sinch) {
        this(sname, soperationSystem, sbrand, smodel);
        this.year=syear;
        this.memory=smemory;
        this.inch=sinch;
    }
    //




}
