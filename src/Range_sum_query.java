package Arrays_Prefix_sum;

import java.util.ArrayList;

public class Range_sum_query {
    public static void brute(int[] arr, int[][] brr) {
        ArrayList<Integer> ans =  new ArrayList<>();
        for(int i = 0; i<brr.length; i++){
            int left = brr[i][0];
            int rigth =  brr[i][1];
            int sum = 0;
            for(int j = left; j<=rigth; j++){
                sum = sum + arr[j-1];
            }
            ans.add(sum);


        }
        System.out.println(ans);
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        int[][] brr = {{1, 4}, {2, 3}};
        brute(arr, brr);
    }

}
