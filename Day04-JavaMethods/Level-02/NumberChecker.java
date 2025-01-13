/*
Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint => 
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
If the number is negative, print negative. 
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
*/

import java.util.Scanner; // Import the Scanner class for user input

// Create NumberChecker class to perform various checks on numbers
public class NumberChecker 
	{ 

    // Create a method to check whether the number is positive or negative
    public static boolean isPositive(int number) 
	{ 
        return number >= 0; // Return true if the number is positive or zero, false otherwise
    }

    // Create a method to check whether the number is even or odd
    public static boolean isEven(int number) 
	{ 
        return number % 2 == 0; // Return true if the number is even, false otherwise
    }

    // Create a method to compare two numbers
    public static int compare(int number1, int number2) 
	{ 
        if (number1 > number2) 
		{ 
            return 1; // Return 1 if number1 is greater than number2
        } 
		else if (number1 == number2) 
		{ 
            return 0; // Return 0 if number1 is equal to number2
        } 
		else 
		{ 
            return -1; // Return -1 if number1 is less than number2
        }
    }

    // Main method to take user input and perform the required checks and comparisons
    public static void main(String[] args) 
	{ 
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Define an array to store 5 integers
        int[] numbers = new int[5]; // Create an int array 'numbers' to store the user input

        // Loop through the array to take user input for each number
        for (int i = 0; i < numbers.length; i++) 
		{ 
            // Prompt user to enter a number
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Store user input in the array

            // Check if the number is positive
            if (isPositive(numbers[i])) 
			{ 
                System.out.print("The number is positive and ");
                // Check if the positive number is even or odd
                if (isEven(numbers[i])) 
				{ 
                    System.out.println("even.");
                } 
				else 
				{ 
                    System.out.println("odd.");
                }
			} 
			else 
			{ 
                System.out.println("The number is negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[4]); // Create an int variable 'comparisonResult' to store the result of comparison

        // Display the result of the comparison
        if (comparisonResult == 1) 
		{ 
            System.out.println("The first element is greater than the last element.");
        } else if (comparisonResult == 0) 
		{ 
            System.out.println("The first element is equal to the last element.");
        } else 
		{	 
            System.out.println("The first element is less than the last element.");
        }

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
