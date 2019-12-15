package Methods;

public class PalindromeNum {

    //int original
    //int reversed
    //321%10=1
    //321/10=32
    //32%10=2
    //reversed=reversed+1
    //reversed=reversed*10+remainderOriginalValue;
    //1*10=10+2=12
    //12*10=120+3;


       public boolean isPalindrome(int original){
        int temp=original;
        int reversed=0;

        while(temp>0) {
            int remainderOriginal=temp%10; //1- 2 -3
            reversed=reversed*10+remainderOriginal; //120+3=123
            temp=temp/10; //32/10=3/10=0
        }
        if(reversed==original) {
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeNum palindrome=new PalindromeNum();
        boolean result=palindrome.isPalindrome(4444);
        System.out.println(result);
    }
}
