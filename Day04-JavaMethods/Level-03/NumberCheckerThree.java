/*
Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.

*/

import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class for user input

// Create NumberCheckerThree utility class to perform various tasks
public class NumberCheckerThree 
{

    // Method to find the count of digits in the number
    public static int countDigits(int number) 
	{
        // Convert number to String to get the length (count of digits)
        return Integer.toString(Math.abs(number)).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) 
	{
        // Convert number to String
        String numberStr = Integer.toString(Math.abs(number));
        // Create an int array to store digits
        int[] digits = new int[numberStr.length()];

        // Loop through the string representation of the number to store each digit
        for (int i = 0; i < numberStr.length(); i++) 
		{
            // Store each digit in the array
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        // Return the digits array
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) 
	{
        // Initialize sum to 0
        int sum = 0;

        // Loop through the digits array to calculate the sum of digits
        for (int digit : digits) 
		{
            // Add each digit to sum
            sum += digit;
        }

        // Return the sum of the digits
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static int sumOfSquaresOfDigits(int[] digits) 
	{
        // Initialize sum to 0
        int sum = 0;

        // Loop through the digits array to calculate the sum of the squares of digits
        for (int digit : digits) 
		{
            // Add the square of each digit to sum
            sum += Math.pow(digit, 2);
        }

        // Return the sum of the squares of the digits
        return sum;
    }

    // Method to check if a number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int number) 
	{
        // Get the digits of the number
        int[] digits = storeDigits(number);
        // Calculate the sum of the digits
        int sum = sumOfDigits(digits);

        // Return true if the number is divisible by the sum of its digits, false otherwise
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int number) 
	{
        // Get the digits of the number
        int[] digits = storeDigits(number);
        // Create a 2D array to store the digit and its frequency
        int[][] frequency = new int[10][2];

        // Initialize the frequency array
        for (int i = 0; i < 10; i++) 
		{
            // Set the digit
            frequency[i][0] = i;
            // Initialize frequency to 0
            frequency[i][1] = 0;
        }

        // Loop through the digits array to count the frequency of each digit
        for (int digit : digits) 
		{
            // Increment the frequency of the digit
            frequency[digit][1]++;
        }

        // Return the frequency array
        return frequency;
    }

    // Main method to call the different methods and display the results
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        // Store user input in the variable 'number'
        int number = scanner.nextInt();

        // Call the methods and display the results
        System.out.println("Number: " + number);

        // Call the method to count digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Call the method to store digits in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Call the method to find the sum of digits
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        // Call the method to find the sum of the squares of digits
        int sumSquaresDigits = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquaresDigits);

        // Call the method to check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Call the method to find the frequency of each digit
        int[][] frequency = findDigitFrequency(number);
        System.out.println("Digit frequencies:");
        // Loop through the frequency array to display the frequency of each digit
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " time(s)");
        }

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
