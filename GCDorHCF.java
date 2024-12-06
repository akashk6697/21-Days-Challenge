
import java.util.Scanner;

public class GCDorHCF {
    public static int calcGCD(int n, int m) {
        // Using the Euclidean algorithm
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the second number (m): ");
        int m = scanner.nextInt();

        int gcd = calcGCD(n, m);
        System.out.println("GCD of " + n + " and " + m + " is: " + gcd);

        scanner.close();
    }
}

