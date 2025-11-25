public class Scearchinarraybyc {

    public static boolean linaer(int[] arr, int num) {
        int n = arr.length;
        for(int i = 0; i< n; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 7, 2};
        int num = 1;
        System.out.println(linaer(arr, num));
    }
}
