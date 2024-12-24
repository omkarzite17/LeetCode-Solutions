package DSA.Array_DSA;

import java.util.Scanner;

public class Array_Creation {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter Values");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }




    }
}
