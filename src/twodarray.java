import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7},{7, 8, 9, 10, 11}};
//
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr[1]));
//
//
//        for (int i = 0; i< arr.length; i++){
//            for(int j = 0; j<arr[i].length; j++){
//                System.out.println(arr[i][j] + " ,");
//            }
//        }
//
//        for (int i = 0; i< arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));

        //taking user input
        Scanner in = new Scanner(System.in);
        System.out.println("print rows:");
        int rows = in.nextInt();
        System.out.println("print cols:");
        int cols = in.nextInt();

        int[][]  arr = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                arr[i][j] = in.nextInt();
            }

        }
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }



        }
    }

