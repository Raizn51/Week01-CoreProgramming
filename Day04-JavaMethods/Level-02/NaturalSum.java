/*
Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create NaturalSum class to compute the sum of natural numbers
class NaturalSum {

    // Create a method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1; // Base case: If n is 1, the sum is 1
        } else {
            return n + sumUsingRecursion(n - 1); // Recursive case: Sum is n + sum of (n-1) natural numbers
        }
    }

    // Create a method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2; // Calculate the sum using the formula
    }

    // Create the main method to take user input and compare the results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Prompt user to enter a natural number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt(); // Create an int variable 'number' to store the user input

        // Check if the input is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("The number entered is not a natural number. Exiting program."); // Print error message if not a natural number
            System.exit(1); // Exit the program
        }

        // Find the sum of n natural numbers using recursion
        int sumRecursion = sumUsingRecursion(number); // Create an int variable 'sumRecursion' to store the sum using recursion

        // Find the sum of n natural numbers using the formula
        int sumFormula = sumUsingFormula(number); // Create an int variable 'sumFormula' to store the sum using formula

        // Print the results of both computations
        System.out.println("Sum of first " + number + " natural numbers (using recursion): " + sumRecursion);
        System.out.println("Sum of first " + number + " natural numbers (using formula): " + sumFormula);

        // Check if both results are equal
        if (sumRecursion == sumFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a discrepancy between the two computations.");
        }

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
