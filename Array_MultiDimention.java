package DSA.Array_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Array_MultiDimention {
    public static void main(String[] args) {
        // int arr[][] = new int[2][];//number of rows is mendatory but number of column is not
        int arr2D[][] = {
            {1,2},{3,4,5},{6,7,8,9}
        };
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" "); 
            }
            System.out.println();
        }

        //  System.out.println(Arrays.deepToString(arr2D));
        //  System.out.println(Arrays.toString(arr2D[1]));
        // input 
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number of rows: ");
        // int i = sc.nextInt();
        // System.out.println("Enter the Number of column: ");
        // int j = sc.nextInt();
        int arr [][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // output
        /* 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } 
        */
        /* 
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        // modify
        System.out.println();
        arr[1][0] = 34;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        */
        // Enhance for loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        }
}
