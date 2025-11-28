import java.util.Arrays;

public class pivotindex {
    public static int Brute(int[] arr) {
        int n = arr.length;
        int[] p_sum = new int[n];
        p_sum[0] = arr[0];
        for(int i = 1; i<=n-1;i++){
            p_sum[i] = p_sum[i-1] + arr[i];
        }
        
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            int leftsum=0;
            int rightsum=0;
            if(i==0){
              leftsum = 0;
            } else{
                leftsum = p_sum[i-1];
            }
            
            rightsum = p_sum[n-1] - p_sum[i];

            if(leftsum==rightsum){
                return i;
            }
         }

        return  -1;
    }
    public static void main(String[] args) {
     int[] arr = {-7, 1, 5, 2, -4, 3, 0};
     int ans = Brute(arr);
        System.out.println(ans);

    }
}
