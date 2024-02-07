package Recursion;

public class Q12_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {8,7,6,5,4,3,2};
        System.out.println(search(arr, 0, arr.length-1, 2));
    }
    static int search(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(target < arr[mid]) return search(arr, mid + 1, end, target);
        if(target > arr[mid]) return  search(arr, start, mid-1, target);
        return mid;
    }
}
