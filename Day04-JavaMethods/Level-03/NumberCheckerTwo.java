/*
Extend or Create a NumberChecker utility class and perform the following task. Call from the main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is an armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.Method to find the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.
*/

import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class for user input

// Create NumberCheckerTwo utility class to perform various tasks
public class NumberCheckerTwo 
{

    // Create a method to find the count of digits in the number
    public static int countDigits(int number) 
	{
        return Integer.toString(Math.abs(number)).length(); // Convert number to String to get the length (count of digits)
    }

    // Create a method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) 
	{
        String numberStr = Integer.toString(Math.abs(number)); // Convert number to String
        int[] digits = new int[numberStr.length()]; // Create an int array to store digits

        // Loop through the string representation of the number to store each digit
        for (int i = 0; i < numberStr.length(); i++) 
		{
            digits[i] = Character.getNumericValue(numberStr.charAt(i)); // Store each digit in the array
        }

        return digits; // Return the digits array
    }

    // Create a method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) 
	{
        int[] digits = storeDigits(number); // Get the digits of the number

        // Loop through the digits array starting from the second digit
        for (int i = 1; i < digits.length; i++) 
		{
            if (digits[i] == 0) 
			{
                return true; // Return true if a non-leading zero is found
            }
        }

        return false; // Return false if no non-leading zero is found
    }

    // Create a method to check if the number is an Armstrong number using the digits array
    public static boolean isArmstrongNumber(int number) 
	{
        int[] digits = storeDigits(number); // Get the digits of the number
        int sum = 0; // Initialize sum to store the sum of digits raised to the power of the number of digits
        int power = digits.length; // Get the power (number of digits)

        // Loop through the digits array to calculate the sum of digits raised to the power
        for (int digit : digits) 
		{
            sum += Math.pow(digit, power); // Add each digit raised to the power to the sum
        }

        return sum == number; // Return true if the sum is equal to the original number, false otherwise
    }

    // Create a method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) 
	{
        int largest = Integer.MIN_VALUE; // Initialize largest with the smallest possible value
        int secondLargest = Integer.MIN_VALUE; // Initialize secondLargest with the smallest possible value

        // Loop through the digits array to find the largest and second largest elements
        for (int digit : digits) 
		{
            if (digit > largest) 
			{
                secondLargest = largest; // Update secondLargest to the previous largest
                largest = digit; // Update largest to the current digit
            } 
			else if (digit > secondLargest && digit != largest) {
                secondLargest = digit; // Update secondLargest if the current digit is greater and not equal to largest
            }
        }

        return new int[] {largest, secondLargest}; // Return an array containing the largest and second largest elements
    }

    // Create a method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) 
	{
        int smallest = Integer.MAX_VALUE; // Initialize smallest with the largest possible value
        int secondSmallest = Integer.MAX_VALUE; // Initialize secondSmallest with the largest possible value

        // Loop through the digits array to find the smallest and second smallest elements
        for (int digit : digits) 
		{
            if (digit < smallest) 
			{
                secondSmallest = smallest; // Update secondSmallest to the previous smallest
                smallest = digit; // Update smallest to the current digit
            } 
			else if (digit < secondSmallest && digit != smallest) 
			{
                secondSmallest = digit; // Update secondSmallest if the current digit is smaller and not equal to smallest
            }
        }

        return new int[] {smallest, secondSmallest}; // Return an array containing the smallest and second smallest elements
    }

    // Main method to call the different methods and display the results
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Store user input in the variable 'number'

        // Call the methods and display the results
        System.out.println("Number: " + number);

        int count = countDigits(number); // Call the method to count digits
        System.out.println("Count of digits: " + count);

        int[] digits = storeDigits(number); // Call the method to store digits in an array
        System.out.println("Digits: " + Arrays.toString(digits));

        boolean isDuck = isDuckNumber(number); // Call the method to check if the number is a duck number
        System.out.println("Is Duck Number: " + isDuck);

        boolean isArmstrong = isArmstrongNumber(number); // Call the method to check if the number is an Armstrong number
        System.out.println("Is Armstrong Number: " + isArmstrong);

        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits); // Call the method to find the largest and second largest elements
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits); // Call the method to find the smallest and second smallest elements
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
