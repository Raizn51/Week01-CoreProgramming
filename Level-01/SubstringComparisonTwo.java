/*
Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result

*/

import java.util.Scanner;

/**
 * Creating Class SubstringComparisonTwo for creating and comparing substrings.
 * The purpose of this class is to create a substring using charAt() method,
 * use the built-in substring() method, and compare the two substrings.
 */
class SubstringComparisonTwo 
{

    public static String createSubstringUsingCharAt(String str, int start, int end) 
	{
        // Initialize an empty string to build the substring 
		String substring = "";

		// Loop through the characters from the start index to the end index 
		for (int i = start; i < end; i++) 
		{ 
			// Append each character to the substring 
			substring += str.charAt(i); 
		} 
		return substring; // Return the created substring 
	}

    public static boolean compareStringsUsingCharAt(String str1, String str2) 
	{
        if (str1.length() != str2.length()) {
            return false; // Return false if the lengths are not equal
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if a mismatch is found
            }
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        // Creating String variable mainString to store the main string input by the user
        String mainString = scanner.next();

        // Prompt the user to enter the start index
        System.out.print("Enter the start index: ");
        // Creating int variable startIndex to store the start index input by the user
        int startIndex = scanner.nextInt();

        // Prompt the user to enter the end index
        System.out.print("Enter the end index: ");
        // Creating int variable endIndex to store the end index input by the user
        int endIndex = scanner.nextInt();

        // Create a substring using the custom method createSubstringUsingCharAt
        String substringUsingCharAt = createSubstringUsingCharAt(mainString, startIndex, endIndex);

        // Create a substring using the built-in substring() method
        String substringUsingBuiltIn = mainString.substring(startIndex, endIndex);

        // Compare the two substrings using the custom method compareStringsUsingCharAt
        boolean isEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Print the substrings and the result of the comparison
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring(): " + substringUsingBuiltIn);
        System.out.println("Are the substrings equal? " + isEqual);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
