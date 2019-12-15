package ConstructorPractice;

public class Employee {

    private String name;
    private int employmentYear;
    private int age;
    private int workHour;
    private String location;


    public Employee() {

    }
    public Employee(String name,int employmentYear) {

        this.name=name;
        this.employmentYear=employmentYear;
    }
    public Employee(String name,int employmentYear,int age,int workHour,String location) {

        this(name, employmentYear);
        this.age=age;
        this.workHour=workHour;
        this.location=location;

        if(age<0)  {
            age=0;
        }

    }
    public int calculateSalary() {
        int calculateSalary = workHour * 55;
        return calculateSalary;
    }
    public double YearlySalary() {

       double YearlySalary=calculateSalary()*(52/2);
        return  YearlySalary;

    }public int totalEmploymentYear() {
        return  totalEmploymentYear();
    }
    public void bonusAmount(int totalEmploymentYear,int totalWorkDay) {
        double yearlySalaryWithBonus;
        if (totalEmploymentYear>5 && totalWorkDay>240) {
            yearlySalaryWithBonus=YearlySalary()*15/100;
            yearlySalaryWithBonus=yearlySalaryWithBonus+YearlySalary();
            System.out.println("Salary with 15% bonus is " +yearlySalaryWithBonus);

        }else if (totalEmploymentYear<5 && totalWorkDay>240) {
            yearlySalaryWithBonus=YearlySalary()*10/100;
            yearlySalaryWithBonus=yearlySalaryWithBonus+YearlySalary();
            System.out.println("Salary with 10% bonus is " +yearlySalaryWithBonus);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public void setEmploymentYear(int employmentYear) {
        this.employmentYear = employmentYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
