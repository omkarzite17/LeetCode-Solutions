package DSA.Array_DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {-2,-1,1,3,4,5,6,7,12,34,56,78,89};
         int target = -10;
        int ans = Binary(arr, target);
        System.out.println(ans);
    }
    static int Binary(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
