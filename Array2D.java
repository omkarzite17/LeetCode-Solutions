package DSA.Array_DSA;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int [][] arr = {
            {12,33,45},
            {2,3,5},
            {77,88,99,66},
            {23,43,23}
        };
        int target = 99;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
     static int [] search(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int []{-1,-1};
     }
}
