import java.util.Arrays;

public class movexerotoright {
    public static void Twopinter(int[] arr){
//        int n = arr.length;
//        int j = -1;
//        for(int i=0; i<n-1; i++){
//            if(arr[i]== 0){
//                j = i;
//                break;
//            }
//        }
//        //System.out.println(j)
//        for(int i = j+1; i<n; i++){
//            if(arr[i] != 0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        int n = arr.length;
        int i = -1;

        for(int j = 0; j<n; j++){
            if(arr[j] == 0){
                 i=j;
                 break;
            }
        }
        for(int j = i+1; j<n; j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {0};
        Twopinter(arr);

    }
}
