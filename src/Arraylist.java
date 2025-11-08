import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(14);

        //to get elelmt from  a particular index
        System.out.println(arrayList.get(1));

        for(int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i) + ",");
        }


    }
}
