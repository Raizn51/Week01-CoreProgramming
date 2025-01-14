import java.util.Scanner;

/*
Write a program to find the first non-repeating character in a string and display the result.
Hint =>
Non-repeating character is a character that occurs only once in the string.
Create a method to find the first non-repeating character in a string using the charAt() method and return the character.
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters.
Loop through the text to find the frequency of characters.
Loop through the text to find the first non-repeating character by checking the frequency of each character.
In the main function, take user inputs, call user-defined methods, and display the result.
*/

// Creating a Class FirstNonRepeatingCharacterFinder to find the first non-repeating character in a string
public class FirstNonRepeatingCharacterFinder 
{

    // Method to find the first non-repeating character in a string using charAt() method
    public static char findFirstNonRepeatingCharacter(String text) 
	{
        int[] frequency = new int[256]; // Array to store the frequency of characters
        int length = text.length();

        // Loop to find the frequency of characters in the text
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }

        // Loop to find the first non-repeating character
        for (int i = 0; i < length; i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i); // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if there is no non-repeating character
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); // Store the user input

        // Finding the first non-repeating character in the input string
        char firstNonRepeatingCharacter = findFirstNonRepeatingCharacter(userInput);

        // Displaying the result
        if (firstNonRepeatingCharacter != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeatingCharacter);
        } else {
            System.out.println("There is no non-repeating character in the string.");
        }
    }
}
