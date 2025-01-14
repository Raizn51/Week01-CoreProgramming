/*
Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/

import java.util.Scanner; // Importing Scanner class for user input

// Creating class StringLength to find and return the length of a string without using the built-in length() method
public class StringLength 
{
    // Creating method findLength to find and return the length of a string without using the built-in length() method
    public static int findLength(String str) 
	{
        // Creating int variable count to store the length of the string
        int count = 0;
        try {
            while (true) 
			{
                // Incrementing the count for each character in the string
                str.charAt(count);
                count++;
            }
        } 
		catch (IndexOutOfBoundsException e) 
		{
            // Handling the exception and returning the count
            return count;
        }
    }

    public static void main(String[] args) 
	{
        // Creating Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter the string: ");
        // Creating String variable userInput to store the user input
        String userInput = scanner.nextLine();

        // Calling the user-defined method to find the length of the string
        int customLength = findLength(userInput);

        // Calling the built-in length() method to find the length of the string
        int builtInLength = userInput.length();

        // Displaying the results
        System.out.println("Length of the string (custom method): " + customLength);
        System.out.println("Length of the string (built-in method): " + builtInLength);

        // Closing the Scanner object to free up resources
        scanner.close();
    }
}
