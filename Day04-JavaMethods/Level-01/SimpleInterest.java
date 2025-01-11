/*
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create SimpleInterest Class to compute the Simple Interest
class SimpleInterest {

    // Create calculateSimpleInterest Method to compute the Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) 
	{
        // Simple Interest calculation formula: (P * R * T) / 100
        return (principal * rate * time) / 100;
    }

    // Create main Method to take user input and display the Simple Interest
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the principal amount
        System.out.print("Enter the Principal amount: ");
        // Create a variable principal to hold the user input for the principal amount
        double principal = scanner.nextDouble();

        // Prompt user to enter the rate of interest
        System.out.print("Enter the Rate of Interest: ");
        // Create a variable rate to hold the user input for the rate of interest
        double rate = scanner.nextDouble();

        // Prompt user to enter the time period
        System.out.print("Enter the Time period: ");
        // Create a variable time to hold the user input for the time period
        double time = scanner.nextDouble();

        // Calculate the simple interest using the provided inputs
        // Create a variable simpleInterest to store the calculated simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Print the calculated simple interest along with the inputs
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f.%n",
                simpleInterest, principal, rate, time);

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
