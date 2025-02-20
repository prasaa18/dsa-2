package Binarysearch;

public class fIRSTlASTOPCCURANCE {
    //2*O(LOG N)--sc-o1
    public static int firstOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                last = mid;
                // look for larger index on the right
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return last;
    }

    public static int[] firstAndLastPosition(int[] arr, int n, int k) {
        int first = firstOccurrence(arr, n, k);
        if (first == -1) return new int[]{-1, -1};
        int last = lastOccurrence(arr, n, k);
        return new int[]{first, last};
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 8;
        int[] ans = firstAndLastPosition(arr, n, x);
        System.out.println("The number of occurrences is: " + ans[0] + " " + ans[1]);
    }


//O(N)


//optimal   2 *o(log n)
//public static int lowerBound1(int []arr, int n, int x) {
//    int low = 0, high = n - 1;
//    int ans = n;
//
//    while (low <= high) {
//        int mid = (low + high) / 2;
//        // maybe an answer
//        if (arr[mid] >= x) {
//            ans = mid;
//            //look for smaller index on the left
//            high = mid - 1;
//        } else {
//            low = mid + 1; // look on the right
//        }
//    }
//    return ans;
//}
//
//
//    public static int upperBound(int[] arr, int x, int n) {
//        int low = 0, high = n - 1;
//        int ans = n;   //assume hypothetical abswer
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            // maybe an answer
//            if (arr[mid] > x) {
//                ans = mid;
//                //look for smaller index on the left
//                high = mid - 1;
//            } else {
//                low = mid + 1; // look on the right
//            }
//        }
//        return ans;
//    }
//
//    public int[] optimal(int[] arr, int n, int x) {
//
//        int plb = lowerBound1(arr, n, x);
//        int pub=upperBound(arr,n,x);

    //ex  :  8==8  or 11!=10   n=8,10
//        if((plb==n)||(arr[plb]!=n)){
//         return new int[]{-1, -1};
//        }
//        return new int[]{plb,pub-1};
//
//        System.out.println("The number of occurrences is: " + ans[0] + " " + ans[1]);
//
//    }


}