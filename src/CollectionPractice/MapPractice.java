package CollectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarOutputStream;

public class MapPractice {

    public static void main(String[] args) {

        Map mapList=new HashMap();
        //Map<key,values>employeeList
        Map<Integer,String>employeeList=new HashMap<>();//if i will not give specify data type ,it will object data type

        employeeList.put(1234,"Aimira"); //storing key and values inside map
        employeeList.put(1235,"David");
        employeeList.put(1236,"Kushal");
        employeeList.put(1237,"Kira");
        employeeList.put(1237,"Kira");
        //i can store same values
        //but key should be unique value
        //if you provide same key with different value
        //it will update the value for the key

        HashMap<Integer,String> ticketMasterEmp=new HashMap<>();
        ticketMasterEmp.putAll(employeeList);
        //get method ,it will get the key a parameter and it will return the value
        String empName=ticketMasterEmp.get(1234);
        System.out.println(empName);

        System.out.println(ticketMasterEmp);

        ticketMasterEmp.remove(1236);
        System.out.println(ticketMasterEmp);
        //Method called keySet(),it will return Set of all the keys from map
        Set<Integer> empID=ticketMasterEmp.keySet();
        //System.out.println(empID);
        for(Integer id:empID){
            System.out.println("Name of the employee is " +ticketMasterEmp.get(id));
        }
        for(Integer id:empID) {
            System.out.println("Id of the employee is" +id);
        }
    }
}
