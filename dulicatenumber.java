package leetcode;

import java.util.HashSet;

public class dulicatenumber {
    static boolean brute(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
   return false;
    }


    static boolean better(int[] arr) {
        HashSet<Integer> duplicate = new HashSet<>();

        int n = arr.length;
        for(int i = 0; i<n; i ++){
            if (duplicate.contains(arr[i])) {
                return true;
            } else{
                duplicate.add(arr[i]);
            }

        }
        return false;
    }


    static void main() {
        int[] arr = {1, 2, 3, 1};
//        boolean ans  = brute(arr);
//        if(ans){
//            System.out.println("true");
//        } else{
//            System.out.println("false");
//        }

        boolean  ans = better(arr);
        if(ans){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
