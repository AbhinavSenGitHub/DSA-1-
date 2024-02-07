package Recursion;

public class Q8_Count_Zeros {
    public static void main(String[] args) {
        System.out.println(count(300210));
        System.out.println(14%2);
    }
    static  int zero = 0;
//    Method one
//    static int count(int num) {
//      if(num%10 == num) return zero;
//        if(num%10 == 0){
//            zero++;
//        }
//        num /= 10;
//        count(num);
//        return zero;
//    }
    static int count (int num){
        return helper(num, 0);
    }
    static int helper(int num, int count){
        if(num == 0) return count;
        if(num%10 == 0){
            return helper(num/10, count+1);
        }
        return helper(num/10, count);
    }
}
