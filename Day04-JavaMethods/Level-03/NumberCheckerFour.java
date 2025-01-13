/*
Extend or Create a NumberChecker utility class and perform the following task. Call from the main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array 
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it

*/
import java.util.Arrays; // Import the Arrays class for array manipulation
import java.util.Scanner; // Import the Scanner class for user input

// Utility class NumberCheckerFour to perform various tasks on numbers
public class NumberCheckerFour 
{

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        // Convert the number to a String and get its length, which is the count of digits
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        // Convert the number to a String
        String numberStr = String.valueOf(number);
        // Create an int array to store the digits
        int[] digits = new int[numberStr.length()];

        // Loop through the string representation of the number to store each digit in the array
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0'; // Convert char to int and store it
        }

        // Return the array containing the digits
        return digits;
    }

    // Method to reverse the array of digits
    public static int[] reverseArray(int[] array) {
        // Create an int array to store the reversed digits
        int[] reversed = new int[array.length];

        // Loop through the original array to reverse the digits
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i]; // Store the digits in reverse order
        }

        // Return the reversed array
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        // Use the Arrays.equals method to compare both arrays
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) {
        // Get the digits of the number
        int[] digits = storeDigits(number);
        // Get the reversed array of digits
        int[] reversed = reverseArray(digits);
        // Compare both arrays to check if the number is a palindrome
        return compareArrays(digits, reversed);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        // Get the digits of the number
        int[] digits = storeDigits(number);

        // Loop through the digits array to check for any non-zero digit after the first digit
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) { // Check if the digit is 0
                return true; // If a 0 is found, it's a duck number
            }
        }

        // If no 0 is found, it's not a duck number
        return false;
    }

    // Main method to call the different utility methods and display results
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to count the number of digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Call the method to store digits in an array
        int[] digitsArray = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        // Call the method to reverse the array of digits
        int[] reversedArray = reverseArray(digitsArray);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        // Call the method to compare the original and reversed arrays
        boolean arraysEqual = compareArrays(digitsArray, reversedArray);
        System.out.println("Arrays equal: " + arraysEqual);

        // Call the method to check if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is palindrome: " + isPalindrome);

        // Call the method to check if the number is a duck number
        boolean isDuckNumber = isDuckNumber(number);
        System.out.println("Is duck number: " + isDuckNumber);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
