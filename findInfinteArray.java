package DSA.Array_DSA;
public class findInfinteArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,23,45,56,67};
        int target = 56;
        int result = search(arr, target);
        System.out.println(result);
    }
    static int search(int arr[],int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = ( end - start + 1) * 2;
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch(int [] arr,int target,int start,int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
