package DSA.Array_DSA;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(rotatedarray(arr, target));
    }

    static int rotatedarray(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // Check if the left side is sorted
            if (arr[start] <= arr[mid]) {
                // Target lies in the left sorted part
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            // Right side is sorted
            else {
                // Target lies in the right sorted part
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            // To handle duplicates, when arr[start] == arr[mid] == arr[end]
            // we can simply reduce the search space by incrementing start or decrementing end
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
        }
        return -1;
    }
}
