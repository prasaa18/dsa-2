package BasicMaths;

import static java.lang.Math.log10;

public class countdigit {

    static int count(int n){
   //  int count=0;
//        while(n>0){
//            int last= n %10;
//
//             n = n/10;
//             count++;
//        }

        int count= (int)log10(n)+1;
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count(456));
    }
}

//if number of iteration depends on division then its tc =log10(n)     if  divide by2 the log2(n)