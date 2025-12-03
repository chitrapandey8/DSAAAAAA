import java.util.Arrays;

public class rainwaterdropping {
    public static void brute(int[] arr) {
        int n = arr.length;
        int ans = 0;

        for(int i =1; i<n-1; i++){
            int leftmax = Integer.MIN_VALUE;
            int rightmax = Integer.MIN_VALUE;
            for(int j = 0; j<=i-1; j++){
                if(arr[j]>leftmax){
                    leftmax = arr[j];
                }
            }
            for(int j = i+1; j<=n-1; j++){
                if(arr[j]>rightmax){
                    rightmax = arr[j];
                }
            }

            int min = Math.min(leftmax, rightmax);
            if(min-arr[i] >0){
                ans =  ans + (min  - arr[i]);
            }

//            System.out.println(ans);
        }
        System.out.println(ans);

    }

    public static void Better(int[] arr) {
        int n = arr.length;
        int[] psum = new int[n];
        psum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            psum[i] = Math.max(arr[i],psum[i-1]);
        }

        int[] ssum = new int[n];
        ssum[n-1] = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            ssum[i] = Math.max(arr[i],ssum[i+1]);
        }


        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans+ Math.min(psum[i],ssum[i])-arr[i];
        }

        System.out.println(ans);

     }


    public static void main(String[] args) {
        int[] arr = {7,0,4,2,5,0,6,4,0,5};
        brute(arr);
        Better(arr);
    }
}