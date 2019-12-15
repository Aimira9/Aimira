package WrapperClass;

public class HomeWorkWrapperClass {

    // Create a method named getIntValue. This method will take the String as a parameter.
    // if the string has int value, it take that the int values and will store as a Integer object
    // and the method will return the Integer object. Please use isDigit() method

    public Integer getIntValue(String value) {
        String num = "";
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (Character.isDigit(ch)) {
                num=num+ch;
            }
        }
        int valueInt = Integer.parseInt(num);
        return valueInt;
    }
    public static void main(String[] args) {

        HomeWorkWrapperClass hw=new HomeWorkWrapperClass();

        System.out.println(hw.getIntValue("09/05/2019-Tech13a"));
        System.out.println(hw.getIntValue("74b-DevTeam205s"));
    }
}

