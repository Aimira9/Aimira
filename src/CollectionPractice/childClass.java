package CollectionPractice;

public class childClass {
    private String name ;
    private int age;
    private String gender;
    private String city;

    public childClass(String name,int age,String gender,String city) {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean checkGoToSchool() {
        if(age>6) {
            System.out.println("can go to school");
            return true;
        }
        System.out.println("can not go to school");
        return false;
    }

    public boolean isPalindrome(String name){
        int p=name.length();
        for(int i=0;i<p/2;++i) {
            if(name.charAt(i)==name.charAt(p-i-1)) {
                return  true;
            }
        }
        return  false;


    }
}
