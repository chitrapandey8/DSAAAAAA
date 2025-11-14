import java.util.ArrayList;
import java.util.Arrays;

public class intersectionofarray {

//    public static void bruteforce(int[] arr, int[] brr) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        int[] record = new int[brr.length];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < brr.length; j++) {
//                if (record[j] == 0 && arr[i] == brr[j]) {
//                    ans.add(arr[i]);
//                    record[j] = 1;
//                    break;
//                }
//            }
//        }
//        System.out.println(ans);

//    public static  void Twopointer(int[] arr, int[] brr){
//        int i = 0;
//        int j = 0;
//        ArrayList<Integer> ans =  new ArrayList<>();
//        while(i< arr.length&& j< brr.length){
//            if(arr[i] == brr[j]){
//                    ans.add(arr[i]);
//                    i++;
//                    j++;
//            } else if(arr[i] < brr[j]){
//                i++;
//            } else{
//                j++;
//            }
//        }
//        System.out.println(ans);

    public static void noduplicates(int[] nums1, int[] nums2){
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else{
                if(ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i]){
                    ans.add(nums1[i]);
                }
                i++;
                j++;
            }

        }
        int[] Result = new int[ans.size()];
        for(int k = 0; k<ans.size(); k++){
            Result[k] = ans.get(k);
        }
        System.out.println(Result);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        int[] brr = {2, 2};
        noduplicates(arr, brr);

        //bruteforce(arr, brr);
       // Twopointer(arr, brr);
    }
}