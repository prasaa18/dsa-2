package ProblemsOnArray.Easy;

public class LinearSearch {

    public static void main(String[] args) {
        int [] a = {1, 2,34 ,4};
        int ans= linearsearch(a, a.length, 4);
        System.out.println(ans);
    }

    private static int linearsearch(int[] a, int n , int num) {
        for(int i=0; i<n; i++){
            if(a[i]==num )
                return  i;
        }
        return  -1;
    }
}
