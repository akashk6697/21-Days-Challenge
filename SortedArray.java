import java.util.Scanner;

public class SortedArray {
    public static int isSorted(int n, int[] a) {
        // Check if the array is sorted
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                return 0; // Array is not sorted
            }
        }
        return 1; // Array is sorted
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Check if the array is sorted
        int result = isSorted(n, a);
        if (result == 1) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        sc.close();
    }
}
