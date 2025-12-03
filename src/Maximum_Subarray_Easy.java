package Assignment;

public class Maximum_Subarray_Easy {
    public static void Brute(int[] arr,int B) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <=j ; k++) {
                    sum = sum + arr[k];
                }

                if(sum<=B && sum>max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }

    public static void Better(int[] arr,int B) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int[] psum = new int[n];
        psum[0] = arr[0];
        for(int i = 1; i<n; i++){
            psum[i] = psum[i-1] + arr[i];
        }
        for(int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                 if (i==0){
                     sum = psum[j];
                 }else {
                     sum = psum[j]-psum[i-1];
                 }
                if(sum<=B && sum>max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }

    public static void Optimal(int[] arr,int B) {
        int n = arr.length;
        int window_sum = 0;
        int r = 0;
        int l = 0;
        while(r<n){
            if (window_sum<B){
                window_sum = window_sum+arr[r];
                r++;
            }

            while(window_sum>B){
                window_sum = window_sum-arr[l];
                l++;
            }
        }
        System.out.println(window_sum);
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        int B = 12;
        Brute(arr,B);
        Better(arr,B);
        Optimal(arr,B);
    }
}
     r
2 5 6
  l