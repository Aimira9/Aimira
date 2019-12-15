package StringPackage;

public class StringSubs {

    public static void main(String[] args) {


        String patientInfo="45 - Walnut - Jessica";

        System.out.println(patientInfo.substring(5));

        System.out.println(patientInfo.substring(5,11));
        //5-11 -->5,6,7,8,9,10
        //3,7---> 3,4,5,6

        //patientInfo.substring (5,5) -->it will empty space
        System.out.println(patientInfo.substring(5,5));

        //patientInfo.substring(5,4)
        // --> java wil throw the exception.(runtime error).

        System.out.println(patientInfo.length());
        // lenght is 21
        //last index number is 20
        System.out.println(patientInfo.substring(5,21)); //it will throw an exception
        //String success="dotentimesmore"
        //System.out.println(success.substring(success.substring(success.indexOf('m"))); //mesmore


        // success.indexOf("m");--->7
        //success.indexOf("m"",8)--->10   --->more
        //success.indexOf("t",4)----> 5
        //System.out.println(success.substring(5)); -->timesmore
        // success.indexOf("e",2)-->3
        //System.out.println(success.substring("e" ,2)); -->entimesmore
        //System.out.println(success.substring(3,3)--->empty string
        //System.out.println(success.substring(3,1)--->runtime error














    }
}
