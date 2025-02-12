package ProblemsOnArray.Easy.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {



// optimal Time Complexity: O(N) + O(N*logN), where N = size of the array.
//Reason: The loop will run at most N times. And sorting the array will take N*logN time complexity.
//
//Space Complexity: O(1) as we are not using any extra space.
    public static String twoSum2(int n, int []arr, int target) {

        Arrays.sort(arr);
        int left = 0, right = n - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                return "YES";
            }
            else if (sum < target)
                left++;

            else right--;
        }
        return "NO";
    }

// better  Time Complexity: O(N), Space Complexity: O(N)  as we use the map data structure.


//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            int moreNeeded = target - num;
//            if (map.containsKey(moreNeeded)) {
//                return new int[]{map.get(moreNeeded), i};   ./// return Map.of(map.get(moreNeeded), i);  if return type map
//            }
//            map.put(num, i);
//        }
//        // If no solution found
//        return new int[]{-1, -1};
//    }
    public static String twoSum1(int n, int []arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";  //  return new int[]{map.get(moreNeeded), i};
            }

            mpp.put(arr[i], i);
        }
        return "NO";  //   return  {-1 ,-1)   ---if indexsex to returm
    }

// bruteforce o(n^2)  sc -o(1)
    public static String twoSum(int n, int []arr, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) return "YES";
            }
        }
        return "NO";
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }


}
