package DSA.Array_DSA;

public class Min {
    public static void main(String[] args) {
        int arr [] = {18,12,15,4,7};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int arr[]){
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue>arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
