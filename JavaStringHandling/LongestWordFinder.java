/*
Find the Longest Word in a Sentence
Problem:
Write a Java program that takes a sentence as input and returns the longest word in the
sentence.
*/

import java.util.Scanner;

// Creating class LongestWordFinder to find the longest word in a given sentence
public class LongestWordFinder 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        // Create a String variable to store the input sentence by the user
        String sentence = scanner.nextLine();

        // Split the sentence into words using the split() method
        String[] words = sentence.split("\\s+");

        // Variable to store the longest word
        String longestWord = "";

        // Loop through each word in the array
        for (String word : words) 
		{
            // If the current word is longer than the longest word found so far, update the longest word
            if (word.length() > longestWord.length()) 
			{
                longestWord = word;
            }
        }

        // Display the longest word
        System.out.println("The longest word in the sentence is: " + longestWord);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
