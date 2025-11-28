public class onceintwicebyc {
    public static int brute(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
           int nums = arr[i];
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == nums) {
                    count++;
                }

            }
            if(count == 1){
                return nums;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 1};
        System.out.println(brute(arr));
    }
}
