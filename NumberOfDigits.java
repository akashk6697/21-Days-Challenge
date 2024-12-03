
    import java.util.Scanner;
    public class NumberOfDigits {
    public static int countDigits(int n){
        // Write your code here.
         n = Math.abs(n);
        
        // Convert the number to a string and return its length
        return Integer.toString(n).length();
    }

    public static void main(String[] args) {
        // Test cases
       Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt();

        // Calculate and print the number of digits
        System.out.println("Number of digits: " + countDigits(n));

        // Close the scanner
        scanner.close();
    
    }
}


