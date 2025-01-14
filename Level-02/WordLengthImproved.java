/*
Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result.

*/

import java.util.Scanner; // Importing the Scanner class to read user input

// Creating the class WordLengthImproved to split the text into words and find the shortest and longest strings in a given text
class WordLengthImproved 
{

    // Creating the method findLength to find and return the length of a string without using the built-in length() method
    public static int findLength(String str) 
	{
        // Creating an int variable count to store the length of the string
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

    // Creating the method customSplit to split the text into words using the charAt() method without using the built-in split() method
    public static String[] customSplit(String text) 
	{
        // Finding the length of the text using the findLength method
        int length = findLength(text);
        // Creating an int variable wordCount to store the number of words in the text
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
        // Creating an int variable index to keep track of the current index in the spaceIndexes array
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
        // Creating an int variable start to keep track of the starting index of each word
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

    // Creating the method wordsWithLengths to create a 2D String array with words and their corresponding lengths
    public static String[][] wordsWithLengths(String[] words) 
	{
        // Creating a 2D array to store the words and their lengths
        String[][] result = new String[words.length][2];

        // Populating the 2D array with words and their lengths
        for (int i = 0; i < words.length; i++) 
		{
            // Storing the word
            result[i][0] = words[i];
            // Storing the length of the word as a String
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        // Returning the 2D array of words and their lengths
        return result;
    }

    // Creating the method findShortestLongest to find the shortest and longest strings in a 2D array of word and length
    public static String[] findShortestLongest(String[][] wordsWithLengths) 
	{
        // Initializing the shortest and longest words
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];

        // Iterating through the array to find the shortest and longest words
        for (String[] wordWithLength : wordsWithLengths) 
		{
            if (findLength(wordWithLength[0]) < findLength(shortest)) 
			{
                shortest = wordWithLength[0];
            }
            if (findLength(wordWithLength[0]) > findLength(longest)) 
			{
                longest = wordWithLength[0];
            }
        }

        // Returning the shortest and longest words in a 1D array
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter the string: ");
        // Creating a String variable userInput to store the user input
        String userInput = scanner.nextLine();

        // Calling the customSplit method to split the text into words
        String[] words = customSplit(userInput);

        // Calling the wordsWithLengths method to get words and their lengths in a 2D array
        String[][] wordsWithLengths = wordsWithLengths(words);

        // Calling the findShortestLongest method to find the shortest and longest words
        String[] shortestLongest = findShortestLongest(wordsWithLengths);

        // Displaying the shortest and longest words
        System.out.println("Shortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);

        // Closing the Scanner object to free up resources
        scanner.close();
    }
}
