package Hashing;

import java.util.HashMap;
import java.util.Scanner;

// if number exceeds 10^7 then use map bcz it stores only the given value intead
// in array stores all 12 number which increas memory
//Let’s understand the difference considering the array: [1, 2, 3, 1, 3, 2, 12].
// Here, the maximum element of the array is 12. So,
//        if we apply array hashing, we need an array of size 13.
//        But if we apply the map data structure, it will be the following:
public class hashmapnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 1;
            //map[arr[i]]++
            if (mp.containsKey(key)) {

                freq = mp.get(key); // fetching from the map i.e intially 0 it contains
                mp.put(key ,freq+1);
                freq++;
            }
            else{

                mp.put(key, freq);
            }                 // inserting into the map
        }

        // Iterate over the map:
        /*

        //map store in sprted prder
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }
        */

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            // fetch:
            if (mp.containsKey(number))
                System.out.println(mp.get(number));
            else
                System.out.println(0);
        }
    }
}
