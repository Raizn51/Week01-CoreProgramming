/*
Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
Hint => 
Take inputs for 3 points x1, y1, x2, y2, and x3, y3
Write a Method to find the 3 points that are collinear using the slope formula. The 3 points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab, bc, and cd are equal. 
slope AB = (y2 - y1)/(x2 - x1), slope BC = (y3 - y2)/(x3 - x3)
slope AC = (y3 - y1)/(x3 - x1) Points are collinear if
slope AB = slope BC = slope Ac
The method to find the three points is collinear using the area of the triangle formula. The Three points are collinear if the area of the triangle formed by three points is 0. The area of a triangle is 
       

area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))

*/

import java.util.Scanner;

public class CollinearityCheck {

    // Create a method arePointsCollinearBySlope to check collinearity
    // of three points using the slope formula
    public static boolean arePointsCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Declare double variables slopeAB, slopeBC, and slopeAC to store the slopes of lines AB, BC, and AC
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Return true if all three slopes are equal, indicating collinearity
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Create a method arePointsCollinearByArea to check collinearity
    // of three points using the area of the triangle formula
    public static boolean arePointsCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Declare a double variable area to store the area of the triangle formed by the points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Return true if the area is 0, indicating collinearity
        return area == 0;
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

        // Declare double variables x3 and y3 to store the coordinates of the third point
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Call the method arePointsCollinearBySlope to check collinearity using the slope formula
        boolean isCollinearBySlope = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Call the method arePointsCollinearByArea to check collinearity using the area formula
        boolean isCollinearByArea = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Print whether the points are collinear using the slope formula
        System.out.println("Collinearity check using slope formula: " + isCollinearBySlope);

        // Print whether the points are collinear using the area formula
        System.out.println("Collinearity check using area formula: " + isCollinearByArea);

        // Close the scanner to release resources
        scanner.close();
    }
}
