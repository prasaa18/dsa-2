package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class mergeSort4 {

        private static void merge(int[] arr, int low, int mid, int high) {
            ArrayList<Integer> temp = new ArrayList<>(); // temporary array
            int left = low;      // starting index of left half of arr
            int right = mid + 1;   // starting index of right half of arr

            //storing elements in the temporary array in a sorted manner//

            while (left <= mid && right <= high) { // one comdition true other will be falseint the end false then beow logic wrk
                if (arr[left] <= arr[right]) {
                    temp.add(arr[left]);
                    left++;
                } else {
                    temp.add(arr[right]);
                    right++;
                }
            }

            // if elements on the left half are still left //

            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }

            //  if elements on the right half are still left //
            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }

            // transfering all elements from temporary to arr //
            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);   ///low-low =0  //low+1 -low =1
            }
        }

        public static void mergeSort(int[] arr, int low, int high) {
            if (low >= high) return;  //low==high bas case
            int mid = (low + high) / 2 ;
            mergeSort(arr, low, mid);  // left half
            mergeSort(arr, mid + 1, high); // right half
            merge(arr, low, mid, high);  // merging sorted halves
        }


        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = 7;
            int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
            System.out.println("Before sorting array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            mergeSort4.mergeSort(arr, 0, n - 1);
            System.out.println("After sorting array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }


