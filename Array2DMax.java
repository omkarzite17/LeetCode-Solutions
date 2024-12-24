package DSA.Array_DSA;

import java.util.Arrays;

public class Array2DMax {
    public static void main(String[] args) {
        int [][] arr = {
            {12,33,45},
            {2,3,5},
            {77,88,99,66},
            {23,43,23,112}
        };
        // int target = 99;
        int[] ans = max(arr);
        System.out.println(Arrays.toString(ans));
    }
     static int [] max(int[][] arr){
        int maxValue = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }
        return new int[]{maxValue};
     }
}

