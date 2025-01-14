/*
Count Vowels and Consonants
Problem:
Write a Java program to count the number of vowels and 
consonants in a given string.
*/

import java.util.Scanner;

// Creating the VowelConsonantCounter class to count vowels and consonants in a given string
public class VowelConsonantCounter 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        // Create a String variable to store the input string by the user
        String input = scanner.nextLine();

        // Variables to store the count of vowels and consonants
        int vowels = 0, consonants = 0;

        // Convert the string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if the character is a consonant
            else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }

        // Display the number of vowels and consonants
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
