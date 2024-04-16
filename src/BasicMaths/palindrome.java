package BasicMaths;

public class palindrome {
    static boolean revserse(int n){
        int rev =0;
        int num =n;
        while(n>0){
            int last = n %10;
            rev = rev *10 +last;
            n =n/10;
        }

        if(rev== num)
            return  true;
        else
           return false ;
    }
    public static void main(String[] args) {
        System.out.println( revserse(151));

    }
}
