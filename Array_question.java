package DSA.Array_DSA;

public class Array_question {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5}; 
        int ans = maximumRange(arr,1,3);
        System.out.println(ans);
    }
    static int maximumRange(int [] arr,int start,int end){
        int maxValue = arr[start];
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (maxValue<arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
