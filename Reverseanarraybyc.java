import java.util.Arrays;

public class Reverseanarraybyc {
    public static void Revserse(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
            while(start< end){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
       // int[] arr = {1, 1, 10};
//        int[] arr = {1, 2, 3, 2, 1};
        int[] arr = {1, 2, 3, 4, 5};
        Revserse(arr);
    }
}
