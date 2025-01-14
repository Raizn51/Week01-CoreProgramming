import java.util.Scanner;

/*
Write a program to find unique characters in a string using the charAt() method and display the result.
Hint =>
Create a method to find the length of the text without using the String method length().
Create a method to find unique characters in a string using the charAt() method and return them as a 1D array.
Create an array to store the unique characters in the text. The size is the length of the text.
Loop to find the unique characters in the text. Use a nested loop where an outer loop iterates through each character,
and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array.
Create a new array to store the unique characters.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

// Creating a Class UniqueCharactersFinder to find unique characters in a string
public class UniqueCharactersFinder 
{

    // Method to find the length of the text without using the String method length()
    public static int findLength(String text) 
	{
        int length = 0;
        // Using a try-catch block to find the length
        try 
		{
            while (true) 
			{
                text.charAt(length); // Access each character until an exception is thrown
                length++;
            }
        } 
		catch (IndexOutOfBoundsException e) 
		{
            // Reached the end of the string
        }
        return length; // Return the length of the string
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) 
	{
        int length = findLength(text); // Find the length of the string
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueCount = 0;

        // Loop to find unique characters
        for (int i = 0; i < length; i++) 
		{
            char currentChar = text.charAt(i); // Get the current character
            boolean isUnique = true;
            // Check if currentChar is unique
            for (int j = 0; j < i; j++) 
			{
                if (currentChar == text.charAt(j)) 
				{
                    isUnique = false; // If character is found before, it is not unique
                    break;
                }
            }
            // If unique, store it in the uniqueChars array
            if (isUnique)
			{
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) 
		{
            result[i] = uniqueChars[i];
        }
        return result; // Return the array of unique characters
    }

    // Main method to run the program
    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); // Store the user input

        // Finding unique characters in the input string
        char[] uniqueCharacters = findUniqueCharacters(userInput);

        // Displaying the result
        System.out.print("Unique characters: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }
    }
}
