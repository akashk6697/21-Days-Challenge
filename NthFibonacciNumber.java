
    import java.util.Scanner; // Importing the Scanner class
    public class NthFibonacciNumber {

    public static int findFibonacci(int n) {
        // Handle edge cases for n = 1 or n = 2
        if (n == 1 || n == 2) {
            return 1;
        }

        // Initialize the first two Fibonacci numbers
        int prev1 = 1; // F(1)
        int prev2 = 1; // F(2)
        int current = 0;

        // Calculate the n-th Fibonacci number iteratively
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2; // F(n) = F(n-1) + F(n-2)
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        // Example Input
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      System.out.println(findFibonacci(n));
        sc.close();
    }
 }


