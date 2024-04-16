package Recursion;

public class ReverseArray {
    //Function to print array
    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//    static void reverseArray(int arr[], int n) {
//        int[] ans = new int[n];
//        for (int i = n - 1; i >= 0; i--) {
//            ans[n - i - 1] = arr[i];
//        }
//        printArray(ans, n);
//    }
    //Function to reverse array using recursion
    static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1};
        reverseArray(arr, 0, n - 1);
        printArray(arr, n);
       // reve(0, arr,n);
    }

//    static  void reve(int i,int a[], int n){
//        if(i>=n/2) return;
//        swap(a[i],a[n-i-1]);
//        reve(i+1, a, n);
//    }
}
