package Recursion;

public class Q5_Product_Of_Digits {
    public static void main(String[] args) {
        System.out.println(product(50454));
    }
    static int product(int num){
        if(num%10 == num) return num;
        return (num%10) * product(num/10);
    }

}
