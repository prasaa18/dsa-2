package ProblemsOnArray.Easy.Medium;

public class StockBuyAndSell {


    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }


    static int maxProfit1(int[] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;    // o(n)  sc -- o(1)
    }


    //Time complexity: O(n^2)
    //
    //Space Complexity: O(1)
    static int maxProfit(int[] arr) {
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }
}
