/*
Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result

*/

import java.util.Scanner;

/**
 * Creating Class CharArrayComparison to return and compare characters in a string.
 * The purpose of this class is to return characters using a custom method,
 * compare the result with the built-in toCharArray() method, and display the result.
 */
public class CharArrayComparison 
{

       public static char[] getCharsUsingCustomMethod(String str) 
	   {
        // Create an array charArray to hold the characters
        char[] charArray = new char[str.length()];
        // Loop through the string and assign each character to the array
        for (int i = 0; i < str.length(); i++) 
		{
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) 
	{
        if (arr1.length != arr2.length) 
		{
            return false; // Return false if the lengths are not equal
        }
        for (int i = 0; i < arr1.length; i++) 
		{
            if (arr1[i] != arr2[i]) 
			{
                return false; // Return false if a mismatch is found
            }
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Creating String variable userInput to store the input string by the user
        String userInput = scanner.next();

        // Get the character array using the custom method getCharsUsingCustomMethod
        char[] charArrayCustom = getCharsUsingCustomMethod(userInput);

        // Get the character array using the built-in toCharArray() method
        char[] charArrayBuiltIn = userInput.toCharArray();

        // Compare the two character arrays using the custom method compareCharArrays
        boolean isEqual = compareCharArrays(charArrayCustom, charArrayBuiltIn);

        // Print the result of the comparison
        System.out.println("Are the character arrays equal? " + isEqual);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
