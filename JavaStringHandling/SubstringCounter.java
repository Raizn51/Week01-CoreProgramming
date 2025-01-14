/*
Find Substring Occurrences
Problem:
Write a Java program to count how many times a given substring occurs in a string.
*/

import java.util.Scanner;

// Creating class SubstringCounter to count occurrences of a substring in a given string
public class SubstringCounter 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Create a String variable to store the input string by the user
        String inputString = scanner.nextLine();

        // Prompt the user to enter a substring
        System.out.print("Enter a substring: ");
        // Create a String variable to store the input substring by the user
        String substring = scanner.nextLine();

        // Variable to store the count of substring occurrences
        int count = 0;

        // Loop to find all occurrences of the substring in the input string
        for (int i = 0; i <= inputString.length() - substring.length(); i++) 
		{
            // Check if the substring matches the part of the input string starting at index i
            if (inputString.substring(i, i + substring.length()).equals(substring)) 
			{
                count++;
            }
        }

        // Display the count of substring occurrences
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times in the string.");

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
