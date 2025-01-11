/*
Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/

import java.util.Scanner; // Import the Scanner class for user input

// Create NumberComparator class to find the smallest and largest of the three numbers
class NumberComparator 
{

    // Create findSmallestAndLargest method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) 
	{
        // Create an array to store the smallest and largest numbers
        int[] result = new int[2];

        // Find the smallest number
        int smallest = number1;
        if (number2 < smallest) 
		{
            smallest = number2;
        }
        if (number3 < smallest) 
		{
            smallest = number3;
        }

        // Find the largest number
        int largest = number1;
        if (number2 > largest) 
		{
            largest = number2;
        }
        if (number3 > largest) 
		{
            largest = number3;
        }

        // Store the smallest and largest numbers in the result array
        result[0] = smallest;
        result[1] = largest;

        // Return the result array
        return result;
    }

    // Create main method to take user input and display the smallest and largest of the three numbers
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        // Create a int variable number1 to hold the user input for the first number
        int number1 = scanner.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        // Create a int variable number2 to hold the user input for the second number
        int number2 = scanner.nextInt();

        // Prompt user to enter the third number
        System.out.print("Enter the third number: ");
        // Create a int variable number3 to hold the user input for the third number
        int number3 = scanner.nextInt();

        // Find the smallest and largest numbers using the findSmallestAndLargest method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Print the smallest and largest numbers
        System.out.printf("The smallest number is %d and the largest number is %d.%n", result[0], result[1]);

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
