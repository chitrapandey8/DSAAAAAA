package leetcode;

import java.util.Arrays;

public class longestcommonprefix {
    static void brute(String[] st) {
        int n = st.length;
        String val = st[0];
        String val1 = st[n - 1];
        int j = 0;
        int num1 = val.length();
        int num2 = val1.length();

        Arrays.sort(st);



        while (j < Math.min(num1, num2)) {                                          //j kaha tak chlna chahiye waha tak jaha tak ki length ki string choti hai.
            if (val.charAt(j) != val1.charAt(j)) {
                break;
            }
            j++;
        }
        val = val.substring(0, j); //0 se start j no of  char
        System.out.println(val);

    }


    public static void main(String[] arr) {
        String[] S = {"flower", "flow", "flight"};
        brute(S);
    }
}



