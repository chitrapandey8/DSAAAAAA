import java.util.Arrays;
import java.util.Scanner;
//sum of divisor
public class Maths {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter n :");
//        int n = in.nextInt();
//        int sum = 0;
//        for(int i = 1; i*i<=n; i++){
//            if(n%i == 0){
//                if(i*i==n){
//                    sum = sum + i;
//                } else{
//                    sum = sum + i + n/i;
//                }
//            }
//        }
//        System.out.println(sum);

        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int n = in.nextInt();
        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(Arrays.toString(arr));
    }
}
