public class Minandmaxbyc {
    public static int[] minmax(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return new int[]{max, min};
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 80};
        int[] ans = minmax(arr);
        System.out.println("max:" +  ans[0]  + "min:" + ans[1]);

    }
}