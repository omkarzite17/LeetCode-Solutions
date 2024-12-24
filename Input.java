package DSA.Array_DSA;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter length of array: ");
        // int n = sc.nextInt();
       // int[] arr = new int[n];
         int [] arr = new int[5];
        // arr[0]=23;
        // arr[1]=45;
        // arr[2]=67;
        // arr[3]=90;
        // arr[4]=12;
        // System.out.println(arr[3]);
        // Input using for loop
        // System.out.println("Enter values in the array");
       /*  
         for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            }
        System.out.println("Array is : ");
        System.out.println(Arrays.toString(arr));
        */
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // input using enhanced for loop
        // for (int num : arr) {//for every element in the array print the array
        //     System.out.print(num+" ");//num represents --> element of array
        //     }   
        //  }

        String arr2[] = new String[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.next();
        }
        System.out.println("Array is : "+Arrays.toString(arr2));
        // modify
        arr2[1]="omkar";
        System.out.println("modified Array is : "+Arrays.toString(arr2));
    }
}
