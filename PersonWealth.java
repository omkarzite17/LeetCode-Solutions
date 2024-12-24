package DSA.Array_DSA;

public class PersonWealth {
    public static void main(String[] args) {
        int [] [] arr = {
            {1,2,3},
            {2,3,4},
            {9,8,1}
        };
        System.out.println(wealth(arr));
    }
    static int wealth(int [][] arr){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
