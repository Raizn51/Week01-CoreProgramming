/*
Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result

*/

import java.util.Scanner; // Importing Scanner class for user input

// Creating class SplitText to split the text into words and compare the result with the built-in split() method
public class SplitText 
{

    // Creating method findLength to find and return the length of a string without using the built-in length() method
    public static int findLength(String str) 
	{
        // Creating int variable count to store the length of the string
        int count = 0;
        try 
		{
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

    // Creating method customSplit to split the text into words using charAt() method without using the built-in split() method
    public static String[] customSplit(String text) 
	{
        // Finding the length of the text using the findLength method
        int length = findLength(text);
        // Creating int variable wordCount to store the number of words in the text
        int wordCount = 1;

        // Counting the number of words in the text
        for (int i = 0; i < length; i++) 
		{
            if (text.charAt(i) == ' ') 
			{
                wordCount++;
            }
        }

        // Creating an array to store the indexes of the spaces
        int[] spaceIndexes = new int[wordCount - 1];
        // Creating int variable index to keep track of the current index in the spaceIndexes array
        int index = 0;

        // Storing the indexes of the spaces in the array
        for (int i = 0; i < length; i++) 
		{
            if (text.charAt(i) == ' ') 
			{
                spaceIndexes[index++] = i;
            }
        }

        // Creating an array to store the words
        String[] words = new String[wordCount];
        // Creating int variable start to keep track of the starting index of each word
        int start = 0;

        // Extracting the words using the indexes and storing them in the words array
        for (int i = 0; i < wordCount - 1; i++) 
		{
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        // Storing the last word in the words array
        words[wordCount - 1] = text.substring(start, length);

        // Returning the array of words
        return words;
    }

    // Creating method compareArrays to compare two String arrays and return a boolean
    public static boolean compareArrays(String[] array1, String[] array2) 
	{
        // Checking if the lengths of the two arrays are equal
        if (array1.length != array2.length) 
		{
            return false;
        }
        // Comparing each element in the two arrays
        for (int i = 0; i < array1.length; i++) 
		{
            if (!array1[i].equals(array2[i])) 
			{
                return false;
            }
        }
        // Returning true if all elements are equal
        return true;
    }

    public static void main(String[] args) 
	{
        // Creating Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter the string: ");
        // Creating String variable userInput to store the user input
        String userInput = scanner.nextLine();

        // Calling the customSplit method to split the text into words and storing the result in customSplitResult
        String[] customSplitResult = customSplit(userInput);

        // Calling the built-in split() method to split the text into words and storing the result in builtInSplitResult
        String[] builtInSplitResult = userInput.split(" ");

        // Calling the compareArrays method to compare the two arrays and storing the result in areArraysEqual
        boolean areArraysEqual = compareArrays(customSplitResult, builtInSplitResult);

        // Displaying the result of the custom split method
        System.out.println("Custom split result: " + String.join(", ", customSplitResult));
        // Displaying the result of the built-in split method
        System.out.println("Built-in split result: " + String.join(", ", builtInSplitResult));
        // Displaying whether both methods produce the same result
        System.out.println("Are both methods producing the same result? " + areArraysEqual);

        // Closing the Scanner object to free up resources
        scanner.close();
    }
}
