
import java.util.Scanner;

public class Tanyaproblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        int k = in.nextInt();

        for(int i = 0 ; i<k; i++){
            if(no%10 != 0){
                no = no - 1;
            } else if(no%10 == 0){
                no = no/10;
            }
        }

        System.out.println(no);
    }
}
