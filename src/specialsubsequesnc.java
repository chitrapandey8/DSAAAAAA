public class specialsubsequesnc {

    public static void ssubseq(String s) {
        int n = s.length();
        int count = 0;
        for(int i =0; i<n; i++){
            if(s.charAt(i) == 'A'){
                for(int j = i+1; j<n; j++) {
                    if (s.charAt(j) == 'G') {
                        count++;
                    }
                }

            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
      String s = "ABCGAG";
      ssubseq(s);

    }
}
