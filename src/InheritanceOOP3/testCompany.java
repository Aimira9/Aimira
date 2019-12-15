package InheritanceOOP3;

public class testCompany {

    public static void main(String[] args) {

        Company company=new Company("Google"); //by default all classes extends from object class
         System.out.println(company.employees());
        System.out.println(company.buildings());
        System.out.println(company.hire()); //coming  from company class

        System.out.println("=============");

        IT it=new IT();
        System.out.println(it.employees());
        System.out.println(it.hire());
        System.out.println(it.progress()); //coming from it class

    }
}
