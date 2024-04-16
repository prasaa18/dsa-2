package BasicMaths;
  // 3^3 + 7^3 + 1^3 = 371   qubic sum of eac digit equal no then aramstorng
public class ArmstroongNumber {


          static boolean ArmstrongNumber(int n)
          {
              int originalno = n;
              int count = 0;
              int temp = n;
              while (temp != 0)
              {
                  count++;
                  temp = temp / 10;
              }
              int sumofpower = 0;

              while (n != 0)
              {
                  int digit = n % 10;
                  sumofpower += Math.pow(digit,count);
                  n /= 10;
              }
              return (sumofpower == originalno);
          }
          public static void main(String args[])
          {
              int n1 = 153;
              if (ArmstrongNumber(n1))
              {
                  System.out.println("Yes, it is an Armstrong Number\n");
              }
              else
              {
                  System.out.println("No, it is not an Armstrong Number\n");
              }

          }
      }