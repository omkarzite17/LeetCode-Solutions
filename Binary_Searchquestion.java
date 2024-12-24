package DSA.Array_DSA;

public class Binary_Searchquestion {
    public static void main(String[] args) {
        int arr [] = {12,23,34,56,67,88};
        int target = 15;
        // int result = CelingOfNumber(arr, target);
		int result = FloorOfNumber(arr, target);
        // if (result == -1) {
		// 	System.out.println("Ceiling of " + target + " doesn't exist in array");
		// }
		// else{
		// 	System.out.println("Ceiling of " + target + " is " + arr[result]);
		// }
		System.out.println("Floor of " + target + " is at index " + result);
    }
    // Ceiling of a number
    static int CelingOfNumber(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            // boolean isAsc = arr[start] < arr[mid];
			if (target <= arr[start]) {
				return start;
			}
			if (target > arr[end]) {
				return -1;
			}
            if (target > arr[mid]) {
                    start = mid + 1;
            } else if(target < arr[mid]){
                    end = mid - 1;
            }else {
                return mid;
            } 
        }
        return start;
    }
	// Floor
	static int FloorOfNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
	
		// If the target is smaller than the smallest element
		if (target < arr[start]) {
			return -1;
		}
	
		while (start <= end) {
			int mid = start + (end - start) / 2;
	
			if (arr[mid] == target) {
				return mid; // Exact match
			} else if (arr[mid] < target) {
				start = mid + 1; // Move right
			} else {
				end = mid - 1; // Move left
			}
		}
	
		// At the end of the loop, `end` will be at the floor index
		return end;
	}
	
}
