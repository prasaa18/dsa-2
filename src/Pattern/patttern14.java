package Pattern;

public class patttern14 {


    public static void nLetterTriangle(int n) {
        // Write your code here


        for(int i=0; i<n; i++){

            for(char ch ='A'; ch<='A' +i ; ch++){
                System.out.print(ch+" ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nLetterTriangle(5);
    }
}
