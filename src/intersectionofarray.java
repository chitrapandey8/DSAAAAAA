import java.util.ArrayList;

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

    public static  void Twopointer(int[] arr, int[] brr){
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans =  new ArrayList<>();
        while(i< arr.length&& j< brr.length){
            if(arr[i] == brr[j]){
                    ans.add(arr[i]);
                    i++;
                    j++;
            } else if(arr[i] < brr[j]){
                i++;
            } else{
                j++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4, 5, 6};
        int[] brr = {2, 3, 3, 5, 6, 6, 7};
        //bruteforce(arr, brr);
        Twopointer(arr, brr);
    }
}