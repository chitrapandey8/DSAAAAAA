import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
//        int[] arr = {3, 5, 8,6 ,7};
//        int element = 5;
//        System.out.println(findelement(arr, element));
        //hard coded array
//        int[] num = {10, 20, 30, 40, 50};
//        System.out.println(num.length);
//        System.out.println(num[1]);
//        Scanner in = new Scanner(System.in);
//         //predefined
//        System.out.println(Arrays.toString(num));
//        //one by one iterating
//        for(int i = 0;  i< num.length; i++) {
//            System.out.print(num[i]);
        //creating array in the size of n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<arr.length; i++){
//            int no = in.nextInt();
//            arr[i] = no;
//            System.out.print(arr[i] + " ");
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
        //function to search weather an element is in array
//    public static int findelement(int[] arr, int element) {
//        int num = element;
//        for(int i=0; i< arr.length; i++){
//            if(arr[i] == num){
//                return  i;
//            }
//        }
//        return -1;
//    }
//    }
//how to add a new element in nth position in an array

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        int[] arr = new int[n+1]; //1 insertion later
//
//        System.out.println("enter element:");
//        for(int i=0; i<n; i++){
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
//        //pos and ele decleration
//        System.out.println("enter pos:");
//        int pos = in.nextInt();
//        System.out.println("enter ele:");
//        int ele = in.nextInt();
//
//        for(int i=n-1; i>=pos-1; i--){
//            arr[i+1] = arr[i];
//        }
//        arr[pos-1] = ele;
//        System.out.println(Arrays.toString(arr));
        ///  also do the deltetion part

//        int[] arr = {2, 5, 7, 8, 7, 9, 7};
//        int element = 7;
//        int[] aans = findmultipleoccurence(arr, element);
//        System.out.println(Arrays.toString(aans));


        int[] arr = {2, 4, 5, 5, 5, 6, 5};
        int element = 5;
        int[] ans = withoutcount(arr, element);
        System.out.println(Arrays.toString(ans));

    }


//    public static int[] findmultipleoccurence(int[] arr, int element){
//        int count = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == element){
//                count++;
//            }
//        }
//
//        int[] output = new int[count];
//        int index = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == element) {
//                    output[index] = i;
//                    index++;
//
//            }
//            }
//        return output;
//    }



     public static int[] withoutcount(int[] arr, int element) {
         int n = arr.length;
         int[] output = new int[n + 1];
         int j = 0;

         for (int i = 0; i < n; i++) {
             if (arr[i] == element) {
                 output[j] = i;
                 j++;
             }
         }
             output[j] = -1;
             return output;
         }

}



