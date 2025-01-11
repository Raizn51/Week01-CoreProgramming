/*
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create Round Class to compute the number of rounds needed for a 5 km run
class Round 
{

    // Create calculatePerimeter Method to compute the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        // Perimeter of a triangle is the sum of all its sides
        return side1 + side2 + side3;
    }

    // Create calculateRounds Method to compute the number of rounds required for a given distance
    public static double calculateRounds(double distance, double perimeter) {
        // Number of rounds is the total distance divided by the perimeter of the triangle
        return distance / perimeter;
    }

    // Create main Method to take user input and display the number of rounds needed for a 5 km run
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the three sides of the triangle
        System.out.print("Enter the first side of the triangle (in meters): ");
        // Create a variable side1 to hold the user input for the first side of the triangle
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle (in meters): ");
        // Create a double variable side2 to hold the user input for the second side of the triangle
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle (in meters): ");
        // Create a double variable side3 to hold the user input for the third side of the triangle
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        // Create a double variable perimeter to store the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Define the total distance for the run in meters (5 km)
        double distance = 5000;

        // Calculate the number of rounds needed to complete the 5 km run
        // Create a variable rounds to store the calculated number of rounds
        double rounds = calculateRounds(distance, perimeter);

        // Print the number of rounds required, rounded to two decimal places
        System.out.printf("The athlete needs to complete %.2f rounds to run 5 km.%n", rounds);

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
