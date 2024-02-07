package Recursion;

import java.util.ArrayList;

public class Q11_FindAllIndex {
    public static void main(String[] args) {

//        find all index of target element

        int arr[] = {1,2,3,4,0,2,2,3,1,6,3,3};
        System.out.println(search(arr, 0, 3));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer>  search(int[] arr, int index, int target){

        if(index == arr.length){
            return list;
        }
        if(target == arr[index]) list.add(index);
        return search(arr, index+1, target);
    }
}
