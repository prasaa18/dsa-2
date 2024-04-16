package Pattern;

public class pattern16
{
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0; i<n; i++){
            char ch= (char) ('A'+ i);
            for(int j=0;j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
 nLetterTriangle(5);
    }
}
