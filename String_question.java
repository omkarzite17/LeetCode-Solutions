package DSA.Array_DSA;

import java.util.Arrays;

public class String_question {
    public static void main(String[] args) {
        String name  = "OMKAR";
        char target = 'M';
        boolean ans = search(name, target);
        System.out.println(Arrays.toString(name.toCharArray()));//it is use to create strings array i.e Name=[O,M,K,A,R]
        // System.out.println(ans);
        }
        static boolean search(String name,char target){
            if (name.length() == 0) {
                return false;
            }
            for (int i = 0; i < name.length(); i++) {
                if (target == name.charAt(i)) {
                    return true;
                }
            }
            return false;
        }

    }
