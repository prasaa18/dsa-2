package Pattern;

public class pattern19 {
    static  void printpatern(int n){

        int inSpace=0;
        for(int i=0; i<n; i++){
            //star
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<inSpace; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            inSpace+=2;
            System.out.println("");
        }
        int iniS=2*n -2;
        for(int i=1; i<=n; i++){
            //star
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           //space
            for(int j=0; j<iniS; j++){
                System.out.print(" ");
            }
           //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            iniS-=2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printpatern(5);
    }
}
