import java.util.HashMap;

public class TwoSumbyc {
    public static int Brute(int[] Arr, int sum) {
        int n = Arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(Arr[i] + Arr[j] == sum){
                    return 1;
                }
            }

        }
        return 0;
    }

    public static int HashmapD(int[] Arr, int sum) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i<Arr.length; i++){
            h.put(Arr[i], i);
        }

        for(int i = 0;  i<Arr.length; i++){
            int y = sum - Arr[i];
            if(h.containsKey(y) && h.get(y) != i) {
                return  1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
//        int[] Arr = {2, 7, 11, 15};
//        int sum = 9;
        int[] Arr = {1, 2, 4};
        int sum = 4;

        System.out.println(HashmapD(Arr, sum));
    }
}
