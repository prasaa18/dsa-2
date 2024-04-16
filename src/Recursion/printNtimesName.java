package Recursion;
//tc - o(n)
//sc- -o(n)
public class printNtimesName {
    static int cnt = 0;
    static void print(){

        // Base Condition.
        if(cnt == 3 ) return;
        System.out.println(cnt);

        // Count incremented.
        cnt = cnt+1;
        print();

    }
    public static void main(String[] args) {
        print();
    }
}
