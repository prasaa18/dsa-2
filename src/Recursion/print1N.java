package Recursion;

public class print1N {

        static void func(int i, int n){

            // Base Condition.
            if(i<1) return;
            System.out.println(i);// reverse

            // Function call to print i till i increments to n.
            func(i-1,n);
            System.out.println(i); //1-n printing

        }
        public static void main(String[] args) {

            // Here, let’s take the value of n to be 4.
            int n = 4;
            func(n,n);
        }


}
