package Arrays_Prefix_sum;

import java.util.Arrays;

public class Product_array_product {

    public static void brute(int[]  arr) {
        int n = arr.length;
        int[] productaArray = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    product = product * arr[j];
                    productaArray[i] = product;
                }
            }
        }
        System.out.println(Arrays.toString(productaArray));
    }
    public static void better(int[] arr) {
        //form preproductarray and suffixproductarray
        int n = arr.length;
        int[] preproduct = new int[n];
        preproduct[0] = 1;
        for(int i = 1; i<n; i++){
            preproduct[i] = preproduct[i-1] * arr[i-1];
        }
        int[] suffixproduct = new int[n];
        suffixproduct[n-1] = 1;
        for(int i = n-2; i>=0; i--){
            suffixproduct[i] = suffixproduct[i+1] * arr[i+1];
        }
        int[] product_array = new int[n];
        for(int i = 0; i<n; i++){
            product_array[i] = preproduct[i] * suffixproduct[i];
        }
        System.out.println(Arrays.toString(product_array));
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        brute(A);
        better(A);
    }
}
