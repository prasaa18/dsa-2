package Hashing;

import java.util.Scanner;

public class characterArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next();

        //precompute:
        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;   //a-a =97-97 =0

                                          //a-b =98-97=1
        }
//        int[] hash = new int[256];    // no lowercase all charcetr  hash all charcter
//        for (int i = 0; i < s.length(); i++) {
//            hash[s[i]]++;

//        }
        //  System.out.println(hash[c]);


        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);
        }
    }

    //abaefg
    //5
    //a
    //b
     //h
    //j
    //x

    //o/p
    //2
    //1
    //
}
