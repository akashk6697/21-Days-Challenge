
public class SwitchCase {
    public static double areaSwitchCase(int ch, double[] a) {
        double area = 0.0;

        switch (ch) {
            case 1:
                // Case for circle area
                if (a.length == 1) {
                    double r = a[0];
                    area = Math.PI * r * r; // Area of circle = ? * r^2
                } else {
                    System.out.println("Error: Invalid input for circle. Expected 1 value (radius).");
                }
                break;

            case 2:
                // Case for rectangle area
                if (a.length == 2) {
                    double l = a[0];
                    double b = a[1];
                    area = l * b; // Area of rectangle = l * b
                } else {
                    System.out.println("Error: Invalid input for rectangle. Expected 2 values (length and breadth).");
                }
                break;

            default:
                // Handle invalid choice
                System.out.println("Error: Invalid choice. Please choose 1 (circle) or 2 (rectangle).");
                break;
        }

        return area;
    }

    public static void main(String[] args) {
        // Example usage:
        int choice = 1; // Change to 2 for rectangle
        double[] parameters = {5}; // Example: radius for circle
        // double[] parameters = {4, 6}; // Example: length and breadth for rectangle
        
        double result = areaSwitchCase(choice, parameters);
        if (result > 0) {
            System.out.println("Area: " + result);
        }
    }
}
