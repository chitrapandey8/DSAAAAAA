//two sum
public class Main{

    public  static void Twosum(int[] arr, int sum){
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            if(arr[i] + arr[j] > sum){
                j--;
            } else if(arr[i] + arr[j] == sum){
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            } else{
                i++;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 13};
        int sum = 15;
        Twosum(arr, sum);
    }

}