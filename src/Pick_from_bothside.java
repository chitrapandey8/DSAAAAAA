package Arrays_Prefix_sum;

public class Pick_from_bothside {
    public static void brute(int[] arr, int B) {
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        for (int i = B; i >= 0; i--) {
            int left = 0;
            if (i != 0) {
                for (int j = 0; j <= i - 1; j++) {
                    left = left + arr[j];
                }
            }
            int right = 0;
            for (int j = n - (B - i); j < n; j++) {
                right = right + arr[j];

            }

            int finallyy = left + right;

            if (finallyy > largest) {
                largest = finallyy;
            }
        }
        System.out.println(largest);

    }
    public static void main(String[] args) {
        int[] arr = {5, -2, 3, 1, 2};
        int B = 3;
        brute(arr, B);
    }
}
