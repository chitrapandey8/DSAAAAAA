public class Maximum_Subarray {
    public static void Brute(int[] arr,int B) {
        int right = 0, left = 0,window_sum = 0;
        int n = arr.length;
        int value = 0;
        while (right<n){
            if (window_sum<B){
                window_sum = window_sum+arr[right];
                right++;
            }
            while(window_sum>=B){
                window_sum = window_sum-arr[left];
                left++;
            }

            if (window_sum>value ){
                value = window_sum;
            }
        }
        System.out.println(value);
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        int B = 13;
        Brute(arr,B);
    }
}
