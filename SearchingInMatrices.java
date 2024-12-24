package DSA.Array_DSA;

import java.util.Arrays;

public class SearchingInMatrices {
    public static void main(String[] args) {
        int [][] arr = {{12, 23, 45}, {41, 67, 89}, {112, 234, 443}};
        int target = 41;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));  // Printing the result of the search
    }
    static int[] search(int [][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            int colIndex = binarySearch(arr[i], target);
            if(colIndex != -1){
                return new int[]{i, colIndex};
            }
        }
        return new int[]{-1,-1};
    }
    static int binarySearch(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                start = mid +1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    
}