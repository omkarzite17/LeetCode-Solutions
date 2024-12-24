package DSA.Array_DSA;

public class OrderAgnostic {
    public static void main(String[] args) {
        int arr [] = {64,56,45,34,23,12,1};
        int target = 23;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
        
    }
    static int orderAgnostic(int [] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            boolean isAsc = arr[start]<arr[end];
            if (arr[mid]== target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
       }
        return -1;
    }
}
