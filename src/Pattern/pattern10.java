package Pattern;

public class pattern10 {

    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=1; i<=2*n-1; i++){

             int stars= i> n ? 2*n-i : i ;

             for(int j =1; j<=stars ; j++){
                 System.out.print("*");
             }
            System.out.println(" ");
        }




    }

    public static void main(String[] args) {
        nStarTriangle(5);
    }
}
