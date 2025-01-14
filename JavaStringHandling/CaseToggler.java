/*
Toggle Case of Characters
Problem:
Write a Java program to toggle the case of each character in a given string. Convert
uppercase letters to lowercase and vice versa.
*/

import java.util.Scanner;

// Creating class CaseToggler to toggle the case of each character in a given string
class CaseToggler 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Create a String variable to store the input string by the user
        String input = scanner.nextLine();

        // Variable to store the modified string with toggled case
        String result = "";

        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) 
		{
            // Get the current character
            char ch = input.charAt(i);

            // Check if the character is uppercase, and convert to lowercase
            if (Character.isUpperCase(ch)) 
			{
                result += Character.toLowerCase(ch);
            }
            // Check if the character is lowercase, and convert to uppercase
            else if (Character.isLowerCase(ch)) 
			{
                result += Character.toUpperCase(ch);
            }
            // If the character is neither, add it as is
            else 
			{
                result += ch;
            }
        }

        // Display the modified string
        System.out.println("Toggled case string: " + result);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
