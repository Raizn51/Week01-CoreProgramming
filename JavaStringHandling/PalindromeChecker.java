import java.util.Scanner;

/*
Palindrome String Check
Problem:
Write a Java program to check if a given string is a palindrome (a string that reads the
same forward and backward).
*/

// Creating class PalindromeChecker to check if a given string is a palindrome
public class PalindromeChecker 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Create a String variable to store the input string by the user
        String input = scanner.nextLine();

        // Convert the input string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Variable to store if the string is a palindrome or not
        boolean isPalindrome = true;

        // Loop through the string to check if it reads the same forward and backward
        int stringLength = input.length();
        for (int i = 0; i < stringLength / 2; i++) {
            if (input.charAt(i) != input.charAt(stringLength - 1 - i)) 
			{
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        if (isPalindrome) 
		{
            System.out.println("The string is a palindrome.");
        } 
		else 
		{
            System.out.println("The string is not a palindrome.");
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
