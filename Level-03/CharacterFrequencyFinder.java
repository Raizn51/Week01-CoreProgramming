/*
Write a program to find the frequency of characters in a string and display the result.
Hint =>
Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array.
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters.
Loop through the text to find the frequency of characters.
Create an array to store the characters and their frequencies.
Loop through the characters in the text and store the characters and their frequencies.
In the main function, take user inputs, call user-defined methods, and display the result.
*/

import java.util.Scanner;

// Creating a Class CharacterFrequencyFinder to find the frequency of characters in a string
public class CharacterFrequencyFinder {

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store the frequency of characters
        int length = text.length();

        // Loop to find the frequency of characters in the text
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }

        // Counting the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Creating a 2D array to store the characters and their frequencies
        String[][] charFrequency = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                charFrequency[index][0] = Character.toString((char) i);
                charFrequency[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }
        return charFrequency; // Return the 2D array with characters and their frequencies
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); // Store the user input

        // Finding the frequency of characters in the input string
        String[][] characterFrequency = findCharacterFrequency(userInput);

        // Displaying the result
        System.out.println("Character | Frequency");
        for (int i = 0; i < characterFrequency.length; i++) {
            System.out.println("    " + characterFrequency[i][0] + "      |     " + characterFrequency[i][1]);
        }
    }
}
