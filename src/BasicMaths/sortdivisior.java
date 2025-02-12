package BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// tc-- o(sqrt(n)+ o(n log(n)) + o(n)
public class sortdivisior {
    public static void main(String[] args){

        printDivisorsOptimal(36);

    }

    public static void printDivisorsOptimal(int n){
        List<Integer>  ls= new ArrayList<>();
        System.out.println("The divisors of "+n+" are:");
        for(int i = 1; i *i <= n; i++)   // istead of call function sqrt which takes time  tahts whuy i*i <=36  6*6 <=36
            if(n % i == 0){
               ls.add(i);
               if(i != n/i)    /// 6 != 36/6 not added 6 another
                    ls.add(n/i);
            }
     //o(no.of factorn * log(no.of factor))
         Collections.sort(ls);    // o(n log(n)) n is number of factor


        //o(no of factor)
        for( int sorted:ls ){
            System.out.println(sorted);
        }
    }


}
