import java.util.Arrays;

public class Rotatearraybyc {
    public static void Rotate(int[] arr, int k) {
        int n  = arr.length;
        k = k%n;


         Swap(arr, n-k, n-1);
         Swap(arr, 0, n-(k+1));
         Swap(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void Swap(int[] arr, int start, int end) {
        while(start< end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;

        Rotate(arr,k);
    }
}
