package DSA.Array_DSA;
public class EvenDigits {
    public static void main(String[] args) {
        int arr [] = {12,2,344,1234};
        int ans = findNum(arr);
        System.out.println(ans);
    }
    static int findNum(int [] nums){
            int count = 0;
            for (int num : nums) {
                if (Even(num)) {
                    count++;
                }
            }
            return count;
    }
    static boolean Even(int num){
        int numofdigits = Digits(num);
        if (numofdigits % 2 == 0) {
            return true;
        }
        return false;
    }
    // Count number of digits
    static int Digits(int num){
        int count = 0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }
}
