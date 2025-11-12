import java.util.Arrays;

public class roatatearraybyreversingalgo {
    public static void Reversearray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int n = arr.length;
    int d = 3;
    d = d%n;
    Reversearray(arr, (n-d), n-1);
    Reversearray(arr, 0, n-(d+1));
    Reversearray(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

}
