import java.util.Arrays;
import java.util.Scanner;

public class cricketover {
    public static void brute(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of querys");
        int Q = in.nextInt();
        for (int i = 0; i < Q; i++) {
            System.out.println("enter left over");
            int left = in.nextInt();
            System.out.println("enter right over");
            int right = in.nextInt();
            int sum = 0;
            for (int j = left; j <= right; j++) {
                sum = sum + arr[j];
            }
            System.out.println(sum);
        }
    }

    public static void better(int[] arr) {
        Scanner in = new Scanner(System.in);
        int n = arr.length;
        int[] csum = new int[n];
        csum[0] = arr[0];
        for(int i = 1; i< n; i++){
            csum[i] = csum[i-1] + arr[i];
    }
        System.out.println("enter left over");
        int left = in.nextInt();
        System.out.println("enter right over");
        int right = in.nextInt();

        int sum = 0;
        if(left == 0){
            sum = csum[right];
        } else{
            sum = csum[right] - csum[left -1];
        }

        System.out.println(sum);
    }


    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 2, 6, 20, 12, 9, 4, 11};
        brute(arr);
        better(arr);
    }

}
