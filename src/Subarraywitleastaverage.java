public class Subarraywitleastaverage {
    public static void Optimal(int[] arr,int k) {
        int window_sum = 0;
        for (int i = 0; i < k; i++) {
            window_sum+=arr[i];
        }
        int least = window_sum/3;

        //Sliding Window
        int n = arr.length;
        int index = 0;
        for (int i = k; i < n; i++) {
            window_sum = window_sum + arr[i] - arr[i-k];
            int average = window_sum/3;
            if (average<least){
                least = average;
                index = i-k+1;
            }
        }

        System.out.println(index);
    }
    public static void main(String[] args) {

        int[] arr ={3,7,90,20,10,50,40};
        Optimal(arr,3);
    }
}

//0 1 2  3
//3 7 90 20 10 50 40
//    100
