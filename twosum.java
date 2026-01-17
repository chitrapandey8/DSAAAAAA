package leetcode;

import java.util.ArrayList;

public class twosum {
    public static int[] arrayofarray(int[] arr, int target) {
        int n = arr.length;
        ArrayList<int[]> A = new ArrayList<>();

        for(int i = 0; i<n; i++){
            int[] temp = new int[2];
            temp[0] = arr[i];
            temp[1] = i;
            A.add(temp);
        }

        A.sort((a,b)->a[0]-b[0]);

        int i = 0; int j = A.size()-1;

        int[] index = new int[2];
        while(i<j){
            int sum = A.get(i)[0] + A.get(j)[0];
            if(sum==target){
                index[0] = A.get(i)[1];
                index[1] = A.get(j)[1];
                i++;
                j--;
            } else if(sum<target){
                i++;
            } else{
                j--;
            }
        }
        return index;


    }

   public static void main() {
        int[] arr = {2, 7, 11, 15};

        arrayofarray(arr,9);

    }
}
