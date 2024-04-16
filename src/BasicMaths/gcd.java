package BasicMaths;
//brute force approch
public class gcd {

    public static void main(String args[]) {
        int num1 = 3, num2 = 6;
        int ans = 1;
        for (int i = Math.min(num1,num2); i>=1; i--) {    ///    worst will be n1= 11 n2 =13  which run ti ans =1
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }
        System.out.print("The GCD of the two number is "+ans);
    }
}
//