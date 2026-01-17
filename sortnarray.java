package leetcode;

import java.util.Arrays;

public class sortnarray {
    static void quicksort(int[] arr, int low, int high) {
       if(low<high) {
           int partitionindex = partition(arr, low, high);
           quicksort(arr, low, partitionindex);
           quicksort(arr, partitionindex + 1, high);
       }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i  = low;
        int j = high;

        while(i<j){
            while (arr[i] < pivot && i <= high){
            i++;
            }
            while(arr[j] >= pivot && j >= low){
                j--;
            }

            if(i<j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;

    }

    static void swap(int[] arr, int a, int b) {
            int temp = arr[b];
            arr[b] = arr[a];
            arr[a] = temp;
    }


    static void main() {
        int[] arr = {5, 3, 8, 4, 2};
        int n = arr.length;
        ;
        quicksort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}
