package ProblemsOnArray.Easy.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityEle {

    //o(N)  +o(N)//moores alogorithm
    public static int majorityElement3(int []v) {
        //size of the given array:
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            }
            else if (el == v[i])
                cnt++;

            else cnt--;
        }

        //checking if the stored element
        // is the majority element:

        //this will check if prblm not hvaing majority  so doestnt include in tc moreover
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {

            if (v[i] == el)

                cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }


    //o(n) +o(nlogn )
    //sc -- o(n)
    public static int majorityElement(int []v) {
        //size of the given array:
        int n = v.length;

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }


    //o(n^2)
    public static int majorityElement1(int []v) {
        //size of the given array:
        int n = v.length;

        for (int i = 0; i < n; i++) {
            //selected element is v[i]
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                // counting the frequency of v[i]
                if (v[j] == v[i]) {
                    cnt++;
                }
            }

            // check if frquency is greater than n/2:
            if (cnt > (n / 2))
                return v[i];
        }

        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement3(arr);
        System.out.println("The majority element is: " + ans);

    }


}
