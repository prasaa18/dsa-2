package Pattern;

public class pattern15 {


    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0; i<n; i++){
            for(char ch='A';ch<='A'+(n-i-1); ch++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
       nLetterTriangle(5);
    }
}
