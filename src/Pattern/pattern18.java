package Pattern;

public class pattern18 {
    public static void nStarTriangle(int n) {
         for(int i=0; i<n; i++){
             char c  = (char) ('E' - i);
             for(char ch =c ; ch<='E'; ch++){
                 System.out.print(ch+" ");
             }
             System.out.println("");
         }
    }
    public static void main(String[] args) {
        nStarTriangle(5);
    }
}
