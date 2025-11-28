public class largestsuminsubarrysinaaray {


    public static void brute(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            for(int j = i; j< n ; j++){
                int sum = 0;
                for(int k = i; k <=j; k++){
                    sum = sum + arr[k];
                }
                if(sum > largest){
                    largest = sum ;
                }
            }
        }
        System.out.println(largest);
    }


    public static void better(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;

        int[] csum = new int[n];
        csum[0] = arr[0];
        for(int i = 1; i<n; i++){
            csum[i] = csum[i-1] + arr[i];
        }


        for(int i = 0; i< n; i++){
            for(int j = i; j<n; j++){
                int sum = 0;
                if(i==0){
                    sum = csum[j];
                } else{
                    sum = csum[j] - csum[i-1];
                }
                if(sum > largest){
                    largest = sum;
                }
            }

        }
        System.out.println(largest);
    }

    public static void kadens(int[] arr) {
        int sum = 0;
        int largest = arr[0];
        int n = arr.length;
        for(int i = 0; i< n;i++){
            sum = sum + arr[i];
            if(sum > largest){
                largest = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int[] arr = {5, -3, 2, -7, 6, 5, 8, -4, 11, -10, -15};
        brute(arr);
        better(arr);
        kadens(arr);

    }
}
