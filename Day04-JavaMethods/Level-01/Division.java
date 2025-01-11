/*
Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor)

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create Division class to find the quotient and remainder of two numbers
class Division
{

    // Create findRemainderAndQuotient method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) 
	{
        // Create an array to store the quotient and remainder
        int[] result = new int[2];

        // Calculate the quotient using the division operator (/)
        int quotient = number / divisor;

        // Calculate the remainder using the moduli operator (%)
        int remainder = number % divisor;

        // Store the quotient and remainder in the result array
        result[0] = quotient;
        result[1] = remainder;

        // Return the result array
        return result;
    }

    // Create main method to take user input and display the quotient and remainder
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number
        System.out.print("Enter the number: ");
        // Create a int variable number to hold the user input
        int number = scanner.nextInt();

        // Prompt user to enter the divisor
        System.out.print("Enter the divisor: ");
        // Create a int variable divisor to hold the user input
        int divisor = scanner.nextInt();

        // Find the quotient and remainder using the findRemainderAndQuotient method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Print the quotient and remainder
        System.out.printf("The quotient is %d and the remainder is %d.%n", result[0], result[1]);

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
