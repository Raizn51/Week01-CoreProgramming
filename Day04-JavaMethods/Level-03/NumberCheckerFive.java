/*
Extend or Create a NumberChecker utility class and perform following task. Call from the main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7
*/
import java.util.Scanner; // Import the Scanner class for user input

// Utility class NumberCheckerFive to perform various tasks on numbers
public class NumberCheckerFive 
{

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        // Prime numbers are greater than 1
        if (number <= 1) {
            return false;
        }
        // Check for factors other than 1 and itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // It's a prime number
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        // Calculate the square of the number
        int square = number * number;
        // Calculate the sum of the digits of the square
        int sumOfDigits = 0;
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        // Check if the sum of the digits is equal to the number
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        // Calculate the sum and product of the digits
        int sumOfDigits = 0, productOfDigits = 1;
        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        // Check if the sum is equal to the product
        return sumOfDigits == productOfDigits;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        // Calculate the square of the number
        int square = number * number;
        // Convert both number and square to String
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        // Check if the square ends with the number
        return squareStr.endsWith(numberStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        // Check if the number is divisible by 7 or ends with 7
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method to call the different utility methods and display results
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to check if the number is prime
        boolean isPrimeNumber = isPrime(number);
        System.out.println("Is prime number: " + isPrimeNumber);

        // Call the method to check if the number is a neon number
        boolean isNeonNumber = isNeon(number);
        System.out.println("Is neon number: " + isNeonNumber);

        // Call the method to check if the number is a spy number
        boolean isSpyNumber = isSpy(number);
        System.out.println("Is spy number: " + isSpyNumber);

        // Call the method to check if the number is an automorphic number
        boolean isAutomorphicNumber = isAutomorphic(number);
        System.out.println("Is automorphic number: " + isAutomorphicNumber);

        // Call the method to check if the number is a buzz number
        boolean isBuzzNumber = isBuzz(number);
        System.out.println("Is buzz number: " + isBuzzNumber);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

