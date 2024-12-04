import java.util.Scanner;

public class ReverseArray {
    public static int[] reverseArray(int n, int[] nums) {
        // Create a new array to hold the reversed elements
        int[] reverse = new int[n];
        
        // Loop through the original array in reverse order
        for (int i = 0; i < n; i++) {
            reverse[i] = nums[n - 1 - i];
        }
        
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        // Read the array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Reverse the array
        int[] reversedArray = reverseArray(n, nums);
        
        // Print the reversed array
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
