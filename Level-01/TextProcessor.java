/*
Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
*/

import java.util.Scanner;

// Creating class TextProcessor to convert text to lowercase, compare results, and split text into words.
class TextProcessor 
{

    // Method to convert each character of a string to lowercase
    public String convertToLowerCase(String input) 
	{
        // Creating a String variable to store the converted text
        String result = "";
        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) 
		{
            char ch = input.charAt(i);
            // Convert uppercase characters to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result; // Return the converted text
    }

    // Method to compare two strings using the charAt() method
    public boolean compareStrings(String str1, String str2) 
	{
        // If the lengths of the strings are not equal, return false
        if (str1.length() != str2.length()) 
		{
            return false;
        }
        // Loop through each character of the strings
        for (int i = 0; i < str1.length(); i++) 
		{
            if (str1.charAt(i) != str2.charAt(i)) 
			{
                return false; // Return false if characters are not equal
            }
        }
        return true; // Return true if all characters are equal
    }

    // Method to split the text into words and return the words along with their lengths in a 2D array
    public String[][] splitText(String input) 
	{
        // Split the text into words using the split() method
        String[] words = input.split("\\s+");
        // Create a 2D array to store the words and their lengths
        String[][] result = new String[words.length][2];
        // Loop through each word and store the word and its length in the 2D array
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result; // Return the 2D array
    }

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Creating String variable userInput to store the input string by the user
        String userInput = scanner.nextLine();

        // Create an instance of TextProcessor
        TextProcessor processor = new TextProcessor();

        // Convert the input string to lowercase using the custom method
        String customLowerCase = processor.convertToLowerCase(userInput);

        // Convert the input string to lowercase using the built-in toLowerCase() method
        String builtInLowerCase = userInput.toLowerCase();

        // Compare the two lowercase strings using the custom method
        boolean areEqual = processor.compareStrings(customLowerCase, builtInLowerCase);

        // Display the result of the comparison
        System.out.println("Custom Lowercase: " + customLowerCase);
        System.out.println("Built-in Lowercase: " + builtInLowerCase);
        System.out.println("Are the two strings equal? " + areEqual);

        // Split the text into words and get the words along with their lengths
        String[][] wordsWithLengths = processor.splitText(userInput);

        // Display the words along with their lengths
        System.out.println("Words with their lengths:");
        for (String[] wordWithLength : wordsWithLengths) 
		{
            System.out.println("Word: " + wordWithLength[0] + ", Length: " + wordWithLength[1]);
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
