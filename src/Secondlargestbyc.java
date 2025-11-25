public class Secondlargestbyc {
    public static void brtue(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for(int i =0; i< n; i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }
           else if(arr[i] > secmax && arr[i] != max){
                secmax =  arr[i];
            }
        }
        System.out.println(secmax);

    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 2, 8, 9};
        brtue(arr);

    }
}
