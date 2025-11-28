public class subsequence {
    public static void Brute(int[] arr,int B) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i = 3;i>=0;i--){
            int left = 0;
            if(i!=0){
                for(int j = 0;j<=i-1;j++){
                    left = left + arr[j];
                }
            }

            int right = 0;
            for( int j = n-B+i; j<n ;j++){
                right = right + arr[j];
            }


            int value = left + right;

            if(value > largest ){
                largest = value;
            }
        }

        System.out.println(largest);
    }

    public static void Better(int[] arr,int B) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int[] psum = new int[n];
        psum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i-1]+arr[i];
        }

        for(int i = 3;i>=0;i--){
            int left = 0;
            if(i!=0){
                left = psum[i-1];
            }


            int right = psum[n-1]-psum[n-(B-i+1)];


            int value = left + right;

            if(value > largest ){
                largest = value;
            }
        }

        System.out.println(largest);
    }
    public static void main(String[] args) {
        int[] arr = {5,-2,3,1,2};
        int B = 3;
        Brute(arr,B);
        Better(arr,B);
    }
}
