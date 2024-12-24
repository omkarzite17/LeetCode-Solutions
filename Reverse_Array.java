package DSA.Array_DSA;

import java.util.Arrays;

public class Reverse_Array{
    public static void main(String[] args) {
        int arr []  = new int[]{1,2,4,5,6,7};
        // Reverse_Array r1 = new Reverse_Array();
        RevArray(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void RevArray(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int arr[],int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}