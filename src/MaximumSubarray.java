public class MaximumSubarray {
    public static void Optimal(int[] arr,int B) {
        int  n = arr.length;
        int left = 0,right = 0;
        int[] psum = new int[n];

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini,arr[i]);
        }

        if (mini>B){
            System.out.println(0);
            return;
        }

        int windowsum = arr[0];
        int value = Integer.MIN_VALUE;
            while(right<=n-1){
                if(windowsum<B){
                    windowsum+=arr[right];
                    right++;
                }

                if (windowsum>B){
                    windowsum = windowsum-arr[left];
                    left++;
                }

                if (windowsum<B && windowsum>value){
                    value =  windowsum;
                }
            }
        System.out.println(value);
    }
    public static void main(String[] args) {
       int[] arr = {4,2,1,7,3,6};
       int B = 8;
       Optimal(arr,B);
    }
}
