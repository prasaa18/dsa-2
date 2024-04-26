package ProblemsOnArray.Easy;

public class MissingNumber {
////  tc --o(N)    xor  will never exceed 10^5  but in su take large datatype but here its not exceed
    public static int missingNumber22(int []a, int N) {

        int xor1 = 0, xor2 = 0;


        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
    }



//optimal approch sum  -o(n)  sc -o(1)

    public static int missingNumber11(int []a, int N) {

        //Summation of first N numbers:
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }

    //better apparcoh  tc-- o(n) +o(n)   sc--o(n)
    public static int missingNumber1(int []a, int N) {

        int hash[] = new int[N + 1]; //hash array  want to store n also thstswhy n+1

        // storing the frequencies:
        for (int i = 0; i < N - 1; i++)
            hash[a[i]]++;

        //checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    //bruteforce o(n1 *n2)  sc--o(1)
    public static int missingNumber(int []a, int N) {

        // Outer loop that runs from 1 to N:
        for (int i = 1; i <= N; i++) {

            // flag variable to check
            //if an element exists
            int flag = 0;

            //Search the element using linear search:
            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {

                    // i is present in the array:
                    flag = 1;
                    break;
                }
            }

            // check if the element is missing
            //i.e flag == 0:

            if (flag == 0) return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
