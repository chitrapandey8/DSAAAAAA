package Arrays_Prefix_sum;

public class Equilibriumindex {
    public static void brute(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int leftsum = 0;
            int rightsum = 0;

            if (i == 0) {
                leftsum = 0;
                for (int j = i + 1; j < n; j++) {
                    rightsum = rightsum + arr[j];
                }
            }
                if (i == n - 1) {
                    rightsum = 0;
                    for (int j = i - 1; j >= 0; j--) {
                        leftsum = leftsum + arr[j];
                    }
                } else {
                    for (int j = i - 1; j >= 0; j--) {
                        leftsum = leftsum + arr[j];
                    }
                    for (int j = i + 1; j < n; j++) {
                        rightsum = rightsum + arr[j];
                    }
                }
                if (leftsum == rightsum) {
                    System.out.println(i);
                }
        }
    }

    public static void better(int[] arr) {
        int n = arr.length;
        int[] psum = new int[n];
        psum[0] = arr[0];
        for(int i = 1; i<n; i++){
            psum[i] = psum[i-1] + arr[i];;
        }

        int leftsum = 0;
        int rightsum = 0;
        for(int i =0; i<psum.length; i++){
            if(i==0){
                leftsum = 0;
            } else{
                leftsum = psum[i-1];
            }

            rightsum = psum[n-1] - psum[i];

            if(leftsum == rightsum){
                System.out.println(i);
            }
        }


    }


    public static void main(String[] args) {
        int[]  arr = {-7, 1, 5, 2, -4, 3, 0};
        brute(arr);
        better(arr);

    }
}
