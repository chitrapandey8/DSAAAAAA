public class littleponny {
    public static int brute(int[] arr, int B) {
        int max = B;
        int count = 0;
     if(linearseacrch(arr, B)){
         for(int i = 0; i< arr.length; i++){
             if(arr[i] > max){
                 count++;
             }
         }
         return count;
     }
     return -1;
    }

    public static boolean linearseacrch(int[] arr, int B) {
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == B){
                return true;
            }
            }
         return false;
        }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2 };
        int B = 3;

//        int[] arr = {1, 4, 2, 3, 5};
//        int B = 3;
        System.out.println(linearseacrch(arr,B));
        System.out.println(brute(arr, B));


    }
    }

