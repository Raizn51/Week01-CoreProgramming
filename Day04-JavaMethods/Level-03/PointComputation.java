/*
Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take inputs for 2 points x1, y1, and x2, y2 
Method to find the Euclidean distance between two points and return the distance
distance = (x2-x1)2 +(y2-y1)2 
Write a Method to find the equation of a line given two points and return the equation which includes the slope and the y-intercept
The equation of a line is given by the equation y = m*x + b Where m is the slope and b is the y-intercept. So firstly compute the slope using the formulae 
m = (y2 - y1)/(x2 - x1)
Post that compute the y-intercept b using the formulae 
b = y1 - m*x1  
Finally, return an array having slope m and y-intercept b 

*/

import java.util.Scanner;

public class PointComputation {

    // Create a method calculateEuclideanDistance to compute the Euclidean distance
    // between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Using Math.pow and Math.sqrt to calculate distance
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Create a method calculateLineEquation to compute the equation of a line
    // given two points (x1, y1) and (x2, y2)
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        // Declare a double array lineEquation to store the slope (m) and y-intercept (b)
        double[] lineEquation = new double[2];

        // Declare a double variable m to store the slope
        double m = (y2 - y1) / (x2 - x1);

        // Declare a double variable b to store the y-intercept
        double b = y1 - m * x1;

        // Store the slope and y-intercept in the array
        lineEquation[0] = m;
        lineEquation[1] = b;

        // Return the array containing slope and y-intercept
        return lineEquation;
    }

    public static void main(String[] args) {

        // Declare a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare double variables x1 and y1 to store the coordinates of the first point
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Declare double variables x2 and y2 to store the coordinates of the second point
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Declare a double variable distance to store the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);

        // Print the calculated Euclidean distance
        System.out.println("The Euclidean distance between the points is: " + distance);

        // Declare a double array lineEquation to store the slope and y-intercept of the line
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);

        // Print the equation of the line in the form y = mx + b
        System.out.println("The equation of the line passing through the points is: y = " 
                           + lineEquation[0] + "x + " + lineEquation[1]);

        // Close the scanner to release resources
        scanner.close();
    }
}
