
import java.util.Scanner;
public class ReverseNumber {
    public static int reverseNumber(int n) {
        // Write your code here
        int rem, rev = 0;
         while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
         public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseNumber(n); 
        sc.close();

       

    }
}