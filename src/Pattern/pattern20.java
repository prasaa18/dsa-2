package Pattern;

public class pattern20 {
    static  void pattern20(int n){
         int space= 2*n -2;
      for(int i=1; i<=2*n-1; i++){

          int stars= i>n ?2*n-i : i;

          //star
          for(int j=1; j<=stars; j++){
              System.out.print("*");
          }
          //space
          for(int j=1; j<=space; j++){
              System.out.print(" ");
          }

          //star
          for(int j=1; j<=stars; j++){
              System.out.print("*");
          }
          if(i<n)
              space-=2;
          else space+=2;

          System.out.println();
        }
    }
    public static void main(String[] args) {
          pattern20(5);
    }
}
