/*
Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 
*/

import java.util.Scanner; // Import the Scanner class for user input

// Create NaturalNumberSum class to find the sum of n natural numbers
class NaturalNumberSum 
{

    // Create findSum method to calculate the sum of the first n natural numbers
    public static int findSum(int n) 
	{
        int sum = 0; // Initialize the sum to 0

        // Use a for loop to calculate the sum of the first n natural numbers
        for (int i = 1; i <= n; i++) 
		{
            sum += i; // Add each number to the sum
        }

        return sum; // Return the calculated sum
    }

    // Create main method to take user input and display the sum of the first n natural numbers
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
		
        // Create a int variable n to hold the user input
        int n = scanner.nextInt();

        // Find the sum of the first n natural numbers using the findSum method
        // Create a int variable sum to store the calculated sum
        int sum = findSum(n);

        // Print the sum of the first n natural numbers
        System.out.printf("The sum of the first %d natural numbers is %d.%n", n, sum);

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
