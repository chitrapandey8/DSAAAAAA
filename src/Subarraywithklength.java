import java.util.Arrays;

public class Subarraywithklength {

    public static void Brute(int[] arr,int k) {
      int n = arr.length;
      int max = Integer.MIN_VALUE;
      for(int i = 0; i<=n-k; i++){
          int sum = 0;
          for(int j = i; j<= i+k-1; j++){
              sum = sum + arr[j];
          }
          if(sum>max){
              max=sum;
          }
      }
        System.out.println(max);
    }


    public static void Better(int[] arr,int k) {
     int n = arr.length;
     int[] psum = new int[n];
     int maxi = Integer.MIN_VALUE;
     psum[0] = arr[0];
     for(int i = 1; i<n; i++){
         psum[i] = psum[i-1] + arr[i];
     }
     for(int i = 0; i<=n-k; i++){
         int sum = 0;
         if(i==0){
             sum = psum[k-1];
         }
         else{
             sum = psum[k+i-1] - psum[i-1];
         }
         if(sum>maxi){
            maxi = sum;
         }
     }
        System.out.println(maxi);
    }


    public static void Optimal(int[] arr,int k) {
     //slidingwindow
        int n = arr.length;
        int windowsum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<=k-1; i++){
            windowsum = windowsum + arr[i];
        }
        for(int i = k; i<n; i++){
            windowsum = windowsum + arr[i] - arr[i-k];
            if(windowsum>maxi){
                maxi = windowsum;
            }
        }
        System.out.println(maxi);
    }


    public static void main(String[] args) {
        int[] arr = {-3,4,-2,5,3,-2,8,2,-1,4};
        Better(arr,3);
        Brute(arr,3);
        Optimal(arr,3);
    }
}


