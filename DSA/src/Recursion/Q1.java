package Recursion;

public class Q1 {
    public static void main(String[] args) {
        printRange(1);
    }
    static void printRange(int num){
        if(num >10){
            return;
        }
        System.out.println(num);
        printRange(num+1);

    }
}
