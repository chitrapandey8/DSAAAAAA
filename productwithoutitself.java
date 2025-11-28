import java.util.ArrayList;
import java.util.Arrays;

public class productwithoutitself {

    public static void preproduct(int[] arr) {
        int n = arr.length;
        int[] presum = new int[n];
        presum[0] = 1;
        for(int i = 1; i<n; i++){
        presum[i] = presum[i-1] * arr[i-1];
        }

        System.out.println(Arrays.toString(presum));

        int[] suffixsum = new int[n];
        suffixsum[n-1] = 1;
        for(int i = n-1; i>0; i--){
            suffixsum[i-1] = suffixsum[i] * arr[i];
        }
        System.out.println(Arrays.toString(suffixsum));

        ArrayList<Integer> product = new ArrayList<>(n);

        for(int i = 0; i<n; i++){
            int addd = presum[i] * suffixsum[i];
            product.add(addd);
            System.out.println(product);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2,3, 4, 5};
        preproduct(arr);


    }
}
