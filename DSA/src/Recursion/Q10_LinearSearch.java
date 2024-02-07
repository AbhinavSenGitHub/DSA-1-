package Recursion;

public class Q10_LinearSearch {
    public static void main(String[] args) {

//      linear search

        int arr[] = {1,2,3,4,0,6,7};
        System.out.println(search(arr, 0, -2));
    }
    static int search(int [] arr, int index, int target){
        if(index == arr.length) return -1;

        if(target != arr[index]) return search(arr, index+1, target);
        return index;
    }
}
