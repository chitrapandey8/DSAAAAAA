package Arrays_Prefix_sum;

public class Time_to_quality {
    public static void brute(int[]  arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int seconds = 0;
        for(int i = 0; i<n; i++){
            int diff = max - arr[i];
            seconds = seconds + diff;
        }
        System.out.println(seconds);
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 2};
        brute(arr);

    }
}
