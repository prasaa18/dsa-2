package ProblemsOnArray.Easy;

import java.util.ArrayList;

public class InterSecOfTwoSortedArray {



        public static void main(String args[]) {
            int n = 10, m = 7;
            int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int arr2[] = {2, 3, 4, 4, 5, 11, 12};
            ArrayList<Integer> Union = FindInerstion(arr1, arr2, n, m);
            System.out.println("Union of arr1 and arr2 is ");
            for (int val: Union)
                System.out.print(val+" ");
        }

        //optimal   o(
    private static ArrayList<Integer> FindInerstion1(int[] arr1, int[] arr2, int n, int m) {
          int i=0; int j=0;
          ArrayList<Integer > list =new ArrayList<>();
           while (i<n && j<m){
               if(arr1[i]<arr2[j]){
                   i++;
               }
               else if(arr2[j]<arr1[i]){
                   j++;
               }else {

                   list.add(arr1[i]);
                   i++;
                   j++;
               }
           }
            return  list;
    }




        //bruteforce tc -- o(n1*n2)
       //sc -- o(m)
    private static ArrayList<Integer> FindInerstion(int[] arr1, int[] arr2, int n, int m) {

            ArrayList<Integer> list =new ArrayList<>();
            int vis[] ={0};   //int vis[] = new int [m] //    smallest array b size

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(arr1[i]== arr2[j] && vis[j]==0){
                           list.add(arr1[j]);
                           vis[j]=1;
                           break;
                    }
                    if(arr2[j]> arr1[i]) // for sorted array do not check othe r ele in b
                    {
                        break;
                    }
                }

            }
            return  list;


    }

}
