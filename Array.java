package DSA.Array_DSA;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Q. Store a roll number
        int rollNumber = 1;
        // Q.Store a persons Name
        String name = "Omkar";
        // Q. Store 5 Roll Number
        // int a = 1;
        // int b = 2;
        // int c = 3;
        // int d = 4;
        // int e = 5;
        // Syntax : Datatype [] arrayname-->Reference variable{Decleration of array,Arr is getting defined in the stack} = new Datatype[size]-->Object{Initialization: Actually object is created in the heap memory};
        // Store 5 roll numbers
        // int [] rollNumbers = new int[5];
        // or directly
        //int [] rollNumbers2 = {1, 2, 3, 4, 5}; //type of data will be same
        // Primitive datatypes memory is stored in stack memory only 
        int arr [] = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 8;
        System.out.println(Arrays.toString(arr));
        // System.out.println("Roll Number: " + arr[0]);
        // Non-Primitive datatypes memory is stored in heap memory
        String [] arr1 = new String[5];
        System.out.println(arr1[0]);
        String a = null;//assign to only non-primitive values
        // int num = null; cannot assign null to primitive values        




    }
}
