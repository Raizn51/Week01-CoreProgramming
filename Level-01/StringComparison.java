/*
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean
*/

import java.util.Scanner; // Importing the Scanner class for taking input from the user

/**
 * Creating Class StringComparison for comparing two strings.
 * The purpose of this class is to provide functionality to compare two strings
 * using a custom method and the built-in equals() method.
 */
class StringComparison 
{

    public static boolean compareStringsUsingCharAt(String str1, String str2) 
	{
        /* Check if the lengths of the two strings are not equal.
           If they are not equal, the strings cannot be the same. */
        if (str1.length() != str2.length()) 
		{
            return false; // Return false if the lengths are not equal
        }

        // Compare each character of the strings
        for (int i = 0; i < str1.length(); i++) 
		{
            // If any character differs, the strings are not equal
            if (str1.charAt(i) != str2.charAt(i)) 
			{
                return false; // Return false if a mismatch is found
            }
        }

        // All characters matched, so the strings are equal
        return true; // Return true if all characters match
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        // Creating String variable str1 to store the first string input by the user
        String str1 = scanner.next(); // Read the first string input

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        // Creating String variable str2 to store the second string input by the user
        String str2 = scanner.next(); // Read the second string input

        // Compare the strings using the custom method compareStringsUsingCharAt
        boolean isEqualUsingCharAt = compareStringsUsingCharAt(str1, str2); // Store the result of the custom comparison method

        // Compare the strings using the built-in equals() method
        boolean isEqualUsingEquals = str1.equals(str2); // Store the result of the built-in equals() method

        // Print the result of the custom comparison method
        System.out.println("Comparison using charAt() method: " + isEqualUsingCharAt); // Print the result of compareStringsUsingCharAt

        // Print the result of the built-in equals() method
        System.out.println("Comparison using equals() method: " + isEqualUsingEquals); // Print the result of equals()

        // Close the Scanner object to free up resources
        scanner.close(); // Close the scanner
    }
}
