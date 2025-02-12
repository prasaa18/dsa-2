//o(log2N)
public class Binarysearch {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] a={ 1, 2, 3, 4,5, 6};
        int ans=Binarysearchsear(a,5);
        System.out.println(ans);

    }
    public static  int Binarysearchsear(int[]a ,int target){
        int low=0;
        int end=a.length-1;

        return search(a,low,end,target);
    }

    private static int search(int[] a, int low,int end, int target) {
        int mid=low+(end-low)/2;
        if(low>end)
            return-1;
         if(target==a[mid])
             return mid;
          else if(target<a[mid])
              return search(a,low,mid-1,target);
              else
                  return search(a,mid+1,end,target);


    }
}