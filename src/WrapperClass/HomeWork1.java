package WrapperClass;

public class HomeWork1 {
    //Create the one method, it will take the string as a parameter
    // and it will return the Wrapper integer value from the string

    public void wrapperInt(String str) {
        String nums=str.replaceAll("[^0-9]","");//google
        int valueInt=Integer.parseInt(nums);
        System.out.println(nums);
    }

    public static void main(String[] args) {
        HomeWork1 hw=new HomeWork1();
        String str="gh3kjd44fgd67jgf";
        hw.wrapperInt("gh3kjd44fgd67jgf");
        //System.out.println();
    }
}
