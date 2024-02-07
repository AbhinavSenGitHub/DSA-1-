package Recursion;

public class Q7_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(check(1231));
    }
    static int sum = 0;

    static int palindrome(int num){
        if(num == 0){
            return num;
        }
        sum = sum * 10 + num%10;
        palindrome(num/10);
        return sum;
    }
    static boolean check(int num){
        if(num == palindrome(num)) return true;
        return false;
    }
}
