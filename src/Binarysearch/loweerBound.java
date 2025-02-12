
//o(logn) base2
public class loweerBound {


        public static int lowerBound1(int []arr, int n, int x) {
            int low = 0, high = n - 1;
            int ans = n;

            while (low <= high) {
                int mid = (low + high) / 2;
                // maybe an answer
                if (arr[mid] >= x) {
                    ans = mid;
                    //look for smaller index on the left
                    high = mid - 1;
                } else {
                    low = mid + 1; // look on the right
                }
            }
            return ans;
        }

        //o(N)
//    public static int lowerBound(int []arr, int n, int x) {
//        for (int i = 0; i < n; i++) {
//            if (arr[i] >= x) {
//                // lower bound found:
//                return i;
//            }
//        }
//        return n;

        public static void main(String[] args) {
            int[] arr = {3, 5, 8, 15, 19};
            int n = 5, x = 9;
            int ind = lowerBound1(arr, n, x);
            System.out.println("The lower bound is the index: " + ind);
        }
    }
