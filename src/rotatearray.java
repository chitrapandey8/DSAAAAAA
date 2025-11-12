import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 3;
        int n = arr.length;;
        int[] temp = new int[d]; //array temp with size d
        for(int i = 0; i <= d-1; i++){
            temp[i] = arr[i]; //0 is in the 0th place in temp
        }
        for(int i = d; i<n; i++){
            arr[i-d] = arr[i];   //putting 4th positong elemt int oth place
        }
        for(int i=n-d; i < n; i++){
            arr[i] = temp[i-(n-d)];  //replacing temp withstarting with  n-d elemts
        }
        System.out.print(Arrays.toString(arr));
    }
}
