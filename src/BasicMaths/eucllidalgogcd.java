package BasicMaths;

public class eucllidalgogcd {
    static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
   }

    static int gcd1(int a, int b){
        while(a>0 && b> 0){
            if(a>b)
                a = a % b;
            else
                b= b % a ;
        }
        if(a==0)
        return  b;
        else
          return  a;
    }
        public static void main(String args[]) {
            int a = 4, b = 8;
            int ans = gcd1(a, b);
            System.out.print("The GCD of the two numbers is "+ans);
        }




}
