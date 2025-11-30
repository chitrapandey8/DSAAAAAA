package Arrays_Prefix_sum;

import java.util.Arrays;

public class Specialindex {
    public static int[] shiffing(int[] arr,int i) {
        int n = arr.length;
        int[] copyarr = Arrays.copyOf(arr, n);

        for (int j = i; j < n - 1; j++) {
            copyarr[j] = copyarr[j + 1];
        }

        copyarr[n - 1] = 0;

        return copyarr;
    }

    public static void brute(int[] arr) {
        int n = arr.length;
        int count = 0;

        for(int i = 0; i<n; i++){
            int[] temp =  shiffing(arr, i);
            int oddsum = 0;
            int evensum = 0;

            for(int j = 0; j < temp.length; j++){
                if(j%2 == 0){
                    evensum = evensum + temp[j];
                } else{
                    oddsum = oddsum + temp[j];
                }
            }


            if(oddsum == evensum){
                count++;
            }
        }
        System.out.println(count);

    }


    public static void better(int[] arr) {
        int n = arr.length;
        int[] evensum = new int[n];
        int[] oddsum = new int[n];
        evensum[0] = arr[0];
        oddsum[0]=0;
        for(int i =1 ; i<n; i++){
            if(i%2==0){
                evensum[i] = evensum[i-1] + arr[i];
                oddsum[i] = oddsum[i-1];
            }
            else{
                evensum[i] = evensum[i-1];
                oddsum[i]= oddsum[i-1] + arr[i];
            }

        }





    }


    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 4};
       // shiffing(arr, 1);
        brute(arr);
        better(arr);

    }

    public static class Pickfrombothside {
        public static void main(String[] args) {

        }
    }
}
