package Recursion;

public class fibonacci {

    //Time Complexity: O(N).As we are iterating over just one for a loop.
    //
    //Space Complexity: O(1).
//    public static void main(String args[]) {
//        int n = 5;
//        if (n == 0) {
//            System.out.println("The Fibonacci Series up to "+n+"th term:");
//            System.out.print(0);
//        } else {
//            int secondLast = 0;
//            int last = 1;
//            System.out.println("The Fibonacci Series up to "+n+"th term:");
//            System.out.print(secondLast + " " + last + " ");
//            int cur;
//            for (int i = 2; i <= n; i++) {
//                cur = last + secondLast;
//                secondLast = last;
//                last = cur;
//                System.out.print(cur + " ");
//            }
//        }
//    }

///multiple fuction call

   // Time Complexity: O(2^N)
    // { This problem involves two function calls for each iteration which further expands
    //  to 4 function calls and so on which makes worst-case time complexity to be exponential in nature }.

   // Space Complexity: O(N)
   // { At maximum there could be N function calls waiting in the recursion stack since we need
   // to calculate the Nth Fibonacci number for which we also need to calculate (N-1) Fibonacci numbers before it }.
    static int fibonacci(int N){

        // Base Condition.
        if(N <= 1){

            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);

        return last + slast;


    }
    public static void main(String[] args) {

        // Here, let’s take the value of N to be 4.
        int N = 4;
        System.out.println(fibonacci(N));
    }
}
