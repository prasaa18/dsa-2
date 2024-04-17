package Hashing;

import java.util.Scanner;

public class countarray {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n;
            n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            //precompute:
            int[] hash = new int[13];  //intialized to 0 all ele
            for (int i = 0; i < n; i++) {
                hash[arr[i]] += 1;  //increment postion index of each element to 1  has[1] =hash[1]+1  i.e hash[1]= 0+1;

            }

            int q;
            q = sc.nextInt();
            while (q-- != 0) {
                int number;
                number = sc.nextInt();
                // fetching:
                System.out.println(hash[number]);
            }
        }
//     //i/p
//     5
//     1 3  2 1 3
//     5
//    1
//    4
//    2
//    3
//    12


//    o/p
//    2
//    0
//    1
//    2
//    0
}
