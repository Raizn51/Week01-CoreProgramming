/*
Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
*/

import java.util.Scanner; // Importing the Scanner class to read user input

// Creating the class TrimString to trim leading and trailing spaces from a string using the charAt() method
public class TrimString 
{

    // Creating the method trimSpaces to trim leading and trailing spaces using the charAt() method
    public static String trimSpaces(String str) {
        // Initializing variables to store the starting and ending points
        int start = 0;
        int end = str.length() - 1;

        // Loop to trim leading spaces
        while (start <= end && str.charAt(start) == ' ') 
		{
            start++;
        }

        // Loop to trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') 
		{
            end--;
        }

        // Creating the trimmed string using the charAt() method
        String trimmedStr = "";
        for (int i = start; i <= end; i++) 
		{
            trimmedStr += str.charAt(i);
        }

        // Returning the trimmed string
        return trimmedStr;
    }

    // Creating the method compareStrings to compare two strings using the charAt() method and return a boolean result
    public static boolean compareStrings(String str1, String str2) 
	{
        // Checking if the lengths of the two strings are equal
        if (str1.length() != str2.length()) 
		{
            return false;
        }

        // Loop to compare each character in the two strings
        for (int i = 0; i < str1.length(); i++) 
		{
            if (str1.charAt(i) != str2.charAt(i)) 
			{
                return false;
            }
        }

        // Returning true if the strings are equal
        return true;
    }

    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter the string: ");
        // Creating a String variablesle userInput to store the user input
        String userInput = scanner.nextLine();

        // Calling the trimSpaces method to get the trimmed string
        String customTrimmed = trimSpaces(userInput);

        // Using the built-in trim() method to trim spaces
        String builtInTrimmed = userInput.trim();

        // Comparing the custom trimmed string with the built-in trimmed string
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);

        // Displaying the results
        System.out.println("Custom trimmed string: \"" + customTrimmed + "\"");
        System.out.println("Built-in trimmed string: \"" + builtInTrimmed + "\"");
        System.out.println("Are both methods producing the same result? " + areEqual);

        // Closing the Scanner object to free up resources
        scanner.close();
    }
}
