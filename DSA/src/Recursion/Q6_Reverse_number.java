package Recursion;

public class Q6_Reverse_number {
    public static void main(String[] args) {
        System.out.println(reverse2(1234));
    }
//    method one
//    static int reverse(int num){
//        if(num%10 == num) return num;
//        System.out.print(num%10);
//        return reverse(num/10);
//    }

//    method 2
    static int sum = 0;
    static  int reverse2(int num){
        if(num == 0){
            return 0;
        }
        int temp = num%10;
        sum = sum * 10 + temp;
        reverse2(num/10);
        return sum;
    }
}
