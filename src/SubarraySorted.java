import java.util.Arrays;

public class SubarraySorted {
//    public static void Brute(int[] arr) {
//        int[] brr = Arrays.copyOf(arr,arr.length);
//        Arrays.sort(brr);
//
//        int i = 0;
//        while(brr[i]==arr[i]){
//            i++;
//        }
//
//        int j = arr.length-1;
//        while(brr[j]==arr[j]){
//            j--;
//        }
//
//        System.out.println(i+" "+j);
//    }

//
    public static boolean OutofOrder(int[] arr, int i) {
        if(i==0){
            return arr[i]>arr[i+1];
        } else if (i== arr.length-1) {
            return arr[i]<arr[i-1];
        }else {
            return  arr[i]>arr[i+1] || arr[i]<arr[i-1];
        }
    }

    public static void Better(int[] arr) {

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (OutofOrder(arr,i)){
                maxi = Math.max(maxi,arr[i]);
                mini = Math.min(mini,arr[i]);
            }
        }

        //Find the index of Maxi and Mini
        int i = 0;
        while(arr[i]<=mini){
            i++;
        }

        int j = arr.length-1;
        while (arr[j]>=maxi){
            j--;
        }

        System.out.println(i+" "+j);
    }


    public static void  brute(int[] arr) {
        int[] brr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(brr);
        int n = arr.length;;

        int i = 0;
        while(arr[i]==brr[i]){
            i++;
        }
        int j = n-1;
        while(arr[j]==brr[j]){
            j--;
        }
        System.out.println(i + "," + j);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,10,11,7,12,7,7,16,18,19};
        brute(arr);
//        Brute(arr);
//        Better(arr);
    }
}
