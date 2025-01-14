/*
Reverse a String
Problem:
Write a Java program to reverse a given string without 
using any built-in reverse functions.
*/
import java.util.Scanner;

// Creating class StringReverse to reverse a given string
public class StringReverse 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Create a String variable to store the input string by the user
        String input = scanner.nextLine();

        // Convert the input string to a char array to allow character swapping
        char[] charArray = input.toCharArray();
        
        // Variable to store the length of the input string
        int stringLength = input.length();
        
        // Loop through the char array and reverse the string
        for (int i = 0; i < stringLength / 2; i++) 
        {
            // Swap the characters at positions i and (length-1-i)
            char temp = charArray[i];
            charArray[i] = charArray[stringLength - 1 - i];
            charArray[stringLength - 1 - i] = temp;
        }

        // Convert the char array back to a string
        input = new String(charArray);

        // Display the reversed string
        System.out.println("Reversed string: " + input);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
