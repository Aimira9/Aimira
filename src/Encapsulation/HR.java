package Encapsulation;

public class HR {
    public static void main(String[] args) {

        Employee emp=new Employee();
        emp.setFirstName("Aimira");
        emp.setLastName("Us");
        emp.setAge(23);
        emp.setEmployeeID("11au");
        emp.setGender('f');
        emp.setSalary(120000);
        System.out.println(emp.getAge());
    }
}
