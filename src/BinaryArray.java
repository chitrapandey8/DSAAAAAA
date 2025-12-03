package Arrays_Carry_Forword;

public class BinaryArray {
    public static void Brute(int[] arr) {
        int  n = arr.length;
        int max_consecutive_ones = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                int l = i-1;
                int r = i+1;
                int l_zeroes = 0;
                int r_zeroes = 0;
                while(l>=0 && arr[l]!=0){
                    l_zeroes++;
                    l--;
                }

                while (r<n && arr[r]!=0){
                    r_zeroes++;
                    r++;
                }

                int value = l_zeroes+r_zeroes+1;
                if (value>max_consecutive_ones){
                    max_consecutive_ones = value;
                }
            }
        }
        System.out.println(max_consecutive_ones);
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,1,0,1,1,0};
        Brute(arr);
    }
}