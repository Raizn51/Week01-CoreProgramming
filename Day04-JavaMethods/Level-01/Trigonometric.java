/*
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/

import java.util.Scanner; // Import the Scanner class for user input

// Create Trigonometric class to calculate trigonometric functions
class Trigonometric {

    // Create calculateTrigonometricFunctions method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) 
	{
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Create an array to store the results of the trigonometric functions
        double[] results = new double[3];

        // Calculate sine, cosine, and tangent of the angle
        results[0] = Math.sin(radians);    // Sine of the angle
        results[1] = Math.cos(radians);    // Cosine of the angle
        results[2] = Math.tan(radians);    // Tangent of the angle

        // Return the results array
        return results;
    }

    // Create main method to take user input and display the trigonometric functions
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        // Create a double variable angle to hold the user input
        double angle = scanner.nextDouble();

        // Calculate the trigonometric functions using the calculateTrigonometricFunctions method
        double[] results = calculateTrigonometricFunctions(angle);

        // Print the results of the trigonometric functions
        System.out.printf("Sine of %.2f degrees is %.4f%n", angle, results[0]);
        System.out.printf("Cosine of %.2f degrees is %.4f%n", angle, results[1]);
        System.out.printf("Tangent of %.2f degrees is %.4f%n", angle, results[2]);

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
