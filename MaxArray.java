package DSA.Array_DSA;

public class MaxArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,4,3,2,6,7,8,-2,-3,-5,-6};
        int target = -2;
        int ans = maxval(arr, target, 4, 11);
        System.out.println(ans);
    }
    static int maxval(int [] arr,int target,int start,int end){
        if(start > end){
            return -1;
        }
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
