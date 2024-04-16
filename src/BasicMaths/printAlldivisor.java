package BasicMaths;
 //tc o(sqrt (n))
// 36 -- 1 2 3 4 6 9  18 36
public class printAlldivisor {

    public static void main(String[] args){

        printDivisorsOptimal(36);

    }

    public static void printDivisorsOptimal(int n){

        System.out.println("The divisors of "+n+" are:");
        for(int i = 1; i <= (int)Math.sqrt(n); i++)
            if(n % i == 0){
                System.out.print(i + " " );


                if(i != n/i) System.out.print(n/i + " ");   /// 6 != 36/6
            }

        System.out.println();
    }
}
