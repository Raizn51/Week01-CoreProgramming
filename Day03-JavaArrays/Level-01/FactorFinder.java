/*
Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
Hint => 
Take the input for a number
Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, factor array of size maxFactor and index variable to reflect the index of the array. 
To find factors, loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index. If the index is equal to maxIndex, then need factors array to store more elements
To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and eventually assign the factors array to the temp array
Finally, Display the factors of the number
*/

import java.util.Scanner; // Import the Scanner class for user input

// Class FactorFinder to find and display the factors of a given number
class FactorFinder 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); // `sc` is a Scanner object for reading input from the console

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt(); // `number` is an integer that stores the user input

        // Initialize variables
        int maxFactor = 10; // Initial maximum capacity for the factors array
        int[] factors = new int[maxFactor]; // `factors` is an array to store the factors of the number
        int index = 0; // `index` is an integer to keep track of the current position in the factors array

        // Loop to find factors of the number and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    // Double the capacity of the array if the current index reaches maxFactor
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor]; // Create a temporary array with the new capacity
                    // Copy elements from the old array to the new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // Assign the new array to the factors array
                }
                factors[index++] = i; // Store the factor in the array and increment the index
            }
        }

        // Display the factors of the number
        System.out.println("The factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " "); // Print each factor stored in the array
        }

        // Close the Scanner object
        sc.close(); // Close the Scanner to release the resource
    }
}
