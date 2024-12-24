package DSA.Array_DSA;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int peak = 4;
        System.out.println("Peak element is at index " + search(arr, peak));
        // System.out.println(peakIndexInMountainArray(arr));
    }
    static int search(int arr[],int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
         }
         return orderAgnostic(arr, target, peak, arr.length-1);
    }
    static int orderAgnostic(int [] arr,int target,int start,int end){
        while (start<=end) {
            int mid = start + (end - start) / 2;
            boolean isAsc = arr[start]<arr[end];
            if (arr[mid] == target) {
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
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid; //you are in descending part of array
            }else{
                start = mid + 1;//yor are in ascending part of array
            }
        }
        return start;//you can return both end or start because both are equal
    }

}
