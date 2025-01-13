/*
Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
Write a Method to find find the roots of a quadratic equation and return the roots

*/

import java.util.Scanner; // Import the Scanner class for user input
import java.util.Arrays; // Import the Arrays class for easy array printing

// Create Quadratic class to find the roots of the quadratic equation
class Quadratic 
{

    // Create a method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) 
	{
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate the discriminant (delta)

        // If delta is positive, find the two roots
        if (delta > 0) 
		{
            double root1 = (-b + Math.sqrt(delta)) / (2 * a); // Calculate the first root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a); // Calculate the second root
            return new double[] {root1, root2}; // Return the two roots as an array
        }
        // If delta is zero, find the one root
        else if (delta == 0) 
		{
            double root = -b / (2 * a); // Calculate the single root
            return new double[] {root}; // Return the single root as an array
        }
        // If delta is negative, return an empty array
        else 
		{
            return new double[] {}; // No real roots exist
        }
    }

    // Main method to take user input and display the roots of the quadratic equation
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Take user input for the coefficients a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble(); // Create a double variable 'a' to store the user input
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble(); // Create a double variable 'b' to store the user input
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble(); // Create a double variable 'c' to store the user input

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c); // Call the findRoots method to calculate the roots

        // Display the roots of the quadratic equation
        if (roots.length == 0) 
		{
            System.out.println("No real roots exist.");
        } 
		else if 
		(roots.length == 1) 
		{
            System.out.println("The root of the quadratic equation is: " + roots[0]);
        } 
		else 
		{
            System.out.println("The roots of the quadratic equation are: " + Arrays.toString(roots));
        }

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
