package ProblemsOnArray.Easy.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reaarrangeArray {


    //varity 2 not equally divide if any left ele add them at end without altering order


//    Explanation: The second O(N) is
//    a combination of O(min(pos, neg)) + O(leftover elements).
//    There can be two cases: when only positive or only negative elements are present,
//    O(min(pos, neg)) + O(leftover) = O(0) + O(N), and when equal no. of positive and negative elements are present,
//    O(min(pos, neg)) + O(leftover) = O(N/2) + O(0). So, from these two cases,
//    we can say the worst-case time complexity is O(N) for the second part, and by adding
//    the first part we get the total complexity of O(2*N).
//
//    Space Complexity:  O(N/2 + N/2) = O(N) { N/2 space required for each of the positive
//    and negative element arrays, where N = size of the array A}.

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
        // Define 2 ArrayLists, one for storing positive
        // and other for negative elements of the array.
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Segregate the array into positives and negatives.
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0)
                pos.add(A.get(i));
            else
                neg.add(A.get(i));
        }

        // If positives are lesser than the negatives.
        if (pos.size() < neg.size()) {

            // First, fill array alternatively till the point
            // where positives and negatives are equal in number.
            for (int i = 0; i < pos.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining negatives at the end of the array.
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                A.set(index, neg.get(i));
                index++;
            }
        }

        // If negatives are lesser than the positives.
        else {
            // First, fill array alternatively till the point
            // where positives and negatives are equal in number.
            for (int i = 0; i < neg.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining positives at the end of the array.
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                A.set(index, pos.get(i));
                index++;
            }
        }
        return A;
    }












    //variety 1 opimal
    //Time Complexity: O(N)
    //sc-    o(N)
    public static void main(String[] args) {
        // Array Initialization.
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        ArrayList<Integer> ans = RearrangebySign(A);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
        int n = A.size();

        // Define array for storing the ans separately.
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        // positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and inc by 2.
            if (A.get(i) < 0) {
                ans.set(negIndex, A.get(i));
                negIndex += 2;
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                ans.set(posIndex, A.get(i));
                posIndex += 2;
            }
        }

        return ans;
    }


  //Time Complexity: O(N+N/2)
   //Space Complexity:  O(N/2 + N/2) = O(N)

    public static int[] RearrangebySign(int[] A, int n){

        // Define 2 vectors, one for storing positive
        // and other for negative elements of the array.
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        // Segregate the array into positives and negatives.
        for(int i=0;i<n;i++){

            if(A[i]>0)
                pos.add(A[i]);
            else
                neg.add(A[i]);
        }

        // Positives on even indices, negatives on odd.
        for(int i=0;i<n/2;i++){

            A[2*i] = pos.get(i);
            A[2*i+1] = neg.get(i);
        }


        return A;
    }
//
//    public static void main(String args[])
//    {
//        // Array Initialisation.
//        int n = 4;
//        int A[]= {1,2,-4,-5};
//
//
//        int[]ans= RearrangebySign(A,n);
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(ans[i]+" ");
//        }
//
//    }
}
