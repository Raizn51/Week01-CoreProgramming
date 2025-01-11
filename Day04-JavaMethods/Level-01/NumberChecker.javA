/*
Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create NumberChecker class to check if a number is positive, negative, or zero
class NumberChecker 
{

    // Create checkNumber method to return -1 for negative, 1 for positive, and 0 for zero
    public static int checkNumber(int number) {
        if (number > 0) 
		{
            return 1; // Positive number
        } 
		else if (number < 0) 
		{
            return -1; // Negative number
        } 
		else {
            return 0; // Zero
        }
    }

    // Create main method to take user input and display whether the number is positive, negative, or zero
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        // Create a int variable number to hold the user input
        int number = scanner.nextInt();

        // Check the number using the checkNumber method
        // Create a int variable result to store the returned value
        int result = checkNumber(number);

        // Print whether the number is positive, negative, or zero
        if (result == 1) 
		{
            System.out.println("The number is positive.");
        } 
		else if (result == -1) 
		{
            System.out.println("The number is negative.");
        } 
		else 
		{
            System.out.println("The number is zero.");
        }

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
