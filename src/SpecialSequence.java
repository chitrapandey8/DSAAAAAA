package Arrays_Carry_Forword;

public class SpecialSequence {
    public static void brute(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i<n; i++){
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

    public static void better(String s) {
        int n = s.length();
        int Acount = 0;
        int stringcount = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == 'A'){
                Acount++;
                stringcount = stringcount + Acount;
            }
        }
        System.out.println(stringcount);
    }

    public static void main(String[] args) {
        String s = "ABCGAG";
        brute(s);
        better(s);
    }
}
