public class Bulbs {
    public static void Brute(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                arr[i] = 1; //pehele i krdo phir count bhadao
                count++;
                for(int j = i+1;j<n;j++){
                    arr[j] = 1-arr[j];
                }
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        int[] arr = {0,1,0,1};
        Brute(arr);
    }
}

//0 1 0 1