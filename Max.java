package DSA.Array_DSA;

public class Max {
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,4};
        System.out.println(Maximum(arr));
        // System.out.println(MaximumRange(arr, 0,3));
    }
    // Adding edge cases here
    // Maximum Element in range
 /* 
    static int MaximumRange(int [] arr,int start,int end){
	    if(end<start){
		return -1;
 	    }
	    if(arr == null){
		return -1;
 	    }        
        int maxValue = arr[start];
        for (int i = 1; i <= end; i++) {
	    if(arr.length==0){
		return -1;
		}
            if (maxValue<arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
}   
*/
    // Maximum Element in the array
    static int Maximum(int [] arr){
            int maxValue = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (maxValue<arr[i]) {
                    maxValue = arr[i];
                }
            }
            return maxValue;
    }
}
