package BasicMaths;

public class Reversenum {
    static int revserse(int n){
        int rev =0;
        while(n>0){
            int last = n %10;
             rev = rev *10 +last;
             n =n/10;
        }
        return  rev;
    }

    public static void main(String[] args) {
        System.out.println( revserse(4543));
    }
}

