import java.util.Scanner;

public class Jaggedarray {
    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8},{9, 10, 11, 12}};
//        int rows = arr.length;;
//        int cols = arr[0].length;
//
//        //for loop for colums:
//        for(int i=0; i<cols; i++){
//            if(i%2==0){
//                for(int j = 0; j<rows; j++){
//                    System.out.print(arr[j][i] + " ");
//                }
//            }
//            else{
//                for(int j = rows-1; j>=0; j--){
//                    System.out.print(arr[j][i] + " ");

        Scanner in = new Scanner(System.in);
        System.out.println("print rows::");
        int rows = in.nextInt();

        int[][] arr = new int[rows][];

        for(int i=0; i<rows; i++){
            System.out.println("print cols::");
            int cols = in.nextInt();

            arr[i] = new int[cols]; //har row ke liye naya array

            for(int j=0; j<cols; j++){
                System.out.println("print elements::");
                arr[i][j] = in.nextInt();
            }

        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
      in.close();

    }
}
