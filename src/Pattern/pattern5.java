package Pattern;

public class pattern5 {
    public static void nTriangle(int n) {
        // Write your code here

        for(int i=1; i<=n;i++){
            for(int j=1;j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }     

//      for (int i = 0; i < N; i++)
//    {
//        // This is the inner loop which loops for the columns
//        // no. of columns = (N - row index) for each line here.
//        for (int j = N; j > i; j--)
//        {
//            System.out.print("* ");
//        }
//
//        // As soon as stars for each iteration are printed, we move to the
//        // next row and give a line break otherwise all stars
//        // would get printed in 1 line.
//        System.out.println();
//    }

    public static void main(String[] args) {
        nTriangle(5);
    }
}
