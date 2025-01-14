/*
Remove Duplicates from a String
Problem:
Write a Java program to remove all duplicate characters from a given string and return
the modified string.
*/

import java.util.Scanner;

// Creating class DuplicateRemover to remove duplicate characters from a given string
public class DuplicateRemover {
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Create a String variable to store the input string by the user
        String input = scanner.nextLine();

        // Variable to store the modified string without duplicates
        String result = "";

        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) 
		{
            // Get the current character
            char ch = input.charAt(i);

            // Flag to check if the character is a duplicate
            boolean isDuplicate = false;

            // Loop through the result string to check for duplicates
            for (int j = 0; j < result.length(); j++) 
			{
                if (ch == result.charAt(j)) 
				{
                    isDuplicate = true;
                    break;
                }
            }

            // If the character is not a duplicate, add it to the result string
            if (!isDuplicate) 
			{
                result += ch;
            }
        }

        // Display the modified string
        System.out.println("Modified string: " + result);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
