package ConstructorPractice;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee empl=new Employee();
        Employee empl1=new Employee("Kubat",10);
        Employee empl2=new Employee("Kira",8,25,8,"Chicago");
        
        System.out.println(empl1.getName()); //kubat
        System.out.println(empl2.getAge());  //25

        System.out.println(empl2.calculateSalary()); //8*55=440  ( salary for two weeks )
        empl1.setWorkHour(10); //10*55=550  for two weeks
        //System.out.println(empl1.calculateSalary()); //0
        System.out.println(empl2.YearlySalary()); //52/2 = 26 ,26*440=11440
        empl2.bonusAmount(15,300);


    }
}
