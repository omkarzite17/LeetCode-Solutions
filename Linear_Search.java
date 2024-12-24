package DSA.Array_DSA;

public class Linear_Search {
    public static void main(String[] args) {
        int arr [] = {12,23,34,45,56,67,78};
        int target = 56;
        int ans1 = linearSearch1(arr, target);
        System.out.println(ans1);
        boolean ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    // Search in the array return the index 
    // otherwise not found return -1
    static int linearSearch1(int [] arr, int target){
        // if array length is equal to zero return -1
        if (arr.length==0) {
            return -1;
        } 
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;// you can also return element
            } 
        }
        // If none of the above statement is executed then return -1 this means target not found
        return -1;
    }
    static boolean linearSearch(int [] arr, int target){
        // if array length is equal to zero return -1
        if (arr.length==0) {
            return false;
        } 
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return true;
            } 
        }
        // If none of the above statement is executed then return -1 this means target not found
        return false;
    }
}
