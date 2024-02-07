package Recursion;

public class Q2Sum_Of_n {
    public static void main(String[] args) {

        System.out.println(sum(10));
    }
    static int sum(int num){
        if(num <= 1){
            return 1;
        }
        return num + sum(num-1);
    }
}
