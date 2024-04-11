package Pattern;

public class pattern5 {
    public static void nTriangle(int n) {
        // Write your code here

        for(int i=1; i<=n;i++){
            for(int j=0;j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        nTriangle(5);
    }
}
