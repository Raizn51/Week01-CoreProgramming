/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow() 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself

*/

import java.util.Scanner; // Import the Scanner class for user input
import java.util.Arrays; // Import the Arrays class for array manipulation

// Creating class NumberCheckerSix to perform various tasks on numbers
class NumberCheckerSix {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        // First loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Second loop to find the factors and store them in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2]; // The second last factor is the greatest factor other than the number itself
    }

    // Method to find the sum of the factors using the factors array and return the sum
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array and return the product
    public static long productOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static long productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Calculate the cube of each factor and multiply
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        // Calculate the sum of proper divisors (excluding the number itself)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number; // A number is perfect if the sum of its proper divisors equals the number
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        // Calculate the sum of proper divisors (excluding the number itself)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number; // A number is abundant if the sum of its proper divisors is greater than the number
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        // Calculate the sum of proper divisors (excluding the number itself)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number; // A number is deficient if the sum of its proper divisors is less than the number
    }

    // Method to calculate the factorial of a digit
    public static int factorial(int digit) {
        if (digit == 0 || digit == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        // Calculate the sum of the factorial of the digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number; // A number is strong if the sum of the factorial of its digits equals the number
    }

    // Main method to call the different utility methods and display results
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to find factors
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        // Call the method to find the greatest factor
        int greatestFactor = greatestFactor(number);
        System.out.println("Greatest factor: " + greatestFactor);

        // Call the method to find the sum of factors
        int sumOfFactors = sumOfFactors(number);
        System.out.println("Sum of factors: " + sumOfFactors);

        // Call the method to find the product of factors
        long productOfFactors = productOfFactors(number);
        System.out.println("Product of factors: " + productOfFactors);

        // Call the method to find the product of cubes of factors
        long productOfCubesOfFactors = productOfCubesOfFactors(number);
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors);

        // Call the method to check if the number is a perfect number
        boolean isPerfectNumber = isPerfectNumber(number);
        System.out.println("Is perfect number: " + isPerfectNumber);

        // Call the method to check if the number is an abundant number
        boolean isAbundantNumber = isAbundantNumber(number);
        System.out.println("Is abundant number: " + isAbundantNumber);

        // Call the method to check if the number is a deficient number
        boolean isDeficientNumber = isDeficientNumber(number);
        System.out.println("Is deficient number: " + isDeficientNumber);

        // Call the method to check if the number is a strong number
        boolean isStrongNumber = isStrongNumber(number);
        System.out.println("Is strong number: " + isStrongNumber);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
