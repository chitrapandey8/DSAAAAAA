package Assignment;

import java.util.Arrays;

public class LeastAverage {
    public static void Brute(int[] arr,int B) {
        int   n = arr.length;
        int index = -1;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i <= n-B; i++) {
            int sum = 0;
            for (int j = i; j < i+B; j++) {
                sum = sum + arr[i];
            }

            int average = sum/B;
            if (average>maxi){
                maxi = average;
                index = i+1;
            }
        }
        System.out.println(index);
    }

    public static void Better(int[] arr,int B) {
        int window_sum= 0;
        int index = 0;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < B; i++) {
            window_sum = window_sum+arr[i];
        }
        int average = window_sum/B;

        for (int i = B; i < n; i++) {
            window_sum = window_sum+arr[i]-arr[i-B];
            average = window_sum/B;
            if (average>max){
                average = max;
                index = i-B;
            }
        }

        System.out.println(index);
    }
    public static void main(String[] args) {
        int[] arr = {3, 7, 90, 20, 10, 50, 40};
        Brute(arr,3);
        Better(arr,3);
    }
}
