/*
Create a program to /*find the factors of a number taken as user input, store the factors in an array and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
*/
import java.util.Scanner; // Import the Scanner class for user input

// Create Factor class to perform various calculations with the factors of a number
class Factor {

    // Create a method to find and return the factors of a number
    public static long[] findFactors(long number) {
        int count = 0; // Create an int variable 'count' to count the number of factors

        // Loop through all numbers from 1 to 'number' to find the count of factors
        for (long i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create an array 'factors' to store the factors, with size 'count'
        long[] factors = new long[count];
        int index = 0; // Create an int variable 'index' to keep track of the array index

        // Loop through again to store the factors in the array
        for (long i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i; // Store the factor in the array and increment the index
            }
        }

        // Return the array of factors
        return factors;
    }

    // Create a method to find the sum of the factors
    public static long sumOfFactors(long[] factors) {
        long sum = 0; // Create a long variable 'sum' to store the sum of the factors

        // Loop through the factors array and calculate the sum
        for (long factor : factors) {
            sum += factor; // Add each factor to the sum
        }

        // Return the sum of the factors
        return sum;
    }

    // Create a method to find the product of the factors
    public static long productOfFactors(long[] factors) {
        long product = 1; // Create a long variable 'product' to store the product of the factors

        // Loop through the factors array and calculate the product
        for (long factor : factors) {
            product *= factor; // Multiply each factor to the product
        }

        // Return the product of the factors
        return product;
    }

    // Create a method to find the sum of the squares of the factors
    public static long sumOfSquaresOfFactors(long[] factors) {
        long sumOfSquares = 0; // Create a double variable 'sumOfSquares' to store the sum of squares of the factors

        // Loop through the factors array and calculate the sum of squares using Math.pow()
        for (long factor : factors) {
            sumOfSquares += Math.pow(factor, 2); // Add the square of each factor to the sumOfSquares
        }

        // Return the sum of the squares of the factors
        return sumOfSquares;
    }

    // Create the main method to take user input and display the results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong(); // Create a long variable 'number' to store the user input

        // Find the factors and store them in an array
        long[] factors = findFactors(number); // Create a long array 'factors' to store the factors of the number

        // Display the factors
        System.out.print("Factors: ");
        for (long factor : factors) {
            System.out.print(factor + " "); // Print each factor
        }
        System.out.println();

        // Calculate and display the sum of the factors
        long sum = sumOfFactors(factors); // Create a long variable 'sum' to store the sum of the factors
        System.out.println("Sum of factors: " + sum); // Print the sum of the factors

        // Calculate and display the product of the factors
        long product = productOfFactors(factors); // Create a long variable 'product' to store the product of the factors
        System.out.println("Product of factors: " + product); // Print the product of the factors

        // Calculate and display the sum of the squares of the factors
        long sumOfSquares = sumOfSquaresOfFactors(factors); // Create a long variable 'sumOfSquares' to store the sum of the squares of the factors
        System.out.println("Sum of squares of factors: " + sumOfSquares); // Print the sum of the squares of the factors

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
