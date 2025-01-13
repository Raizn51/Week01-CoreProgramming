/*
Write a program to demonstrate NumberFormatException
Hint => 
Define a variable to take user input as a String 
Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text. In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

*/

import java.util.Scanner;

// Creating class CustomNumberFormatException that contains methods to generate and handle NumberFormatException.
public class CustomNumberFormatException 
{

    // Method to generate NumberFormatException
    public void generateException(String input) 
	{
        // Creating String variable text and initializing it with user input
        String text = input;
        // Using Integer.parseInt() to extract number from the text, which will generate NumberFormatException if text does not contain a valid number
        System.out.println(Integer.parseInt(text)); // This will throw NumberFormatException if text is not a valid number
    }

    // Method to handle NumberFormatException
    public void handleException(String input) 
	{
        // Creating String variable text and initializing it with user input
        String text = input;
        try {
            // Using Integer.parseInt() to extract number from the text, which will generate NumberFormatException if text does not contain a valid number
            System.out.println(Integer.parseInt(text)); // This will throw NumberFormatException if text is not a valid number
        } 
		catch (NumberFormatException e) 
		{
            // Catch the NumberFormatException and print an informative message
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } 
		catch (RuntimeException e) {
            // Catch any other RuntimeException and print an informative message
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Creating String variable userInput to store the input string by the user
        String userInput = scanner.nextLine();

        // Create an instance of CustomNumberFormatException
        CustomNumberFormatException demo = new CustomNumberFormatException();

        // Call the method to generate NumberFormatException
        try 
		{
            demo.generateException(userInput);
        } 
		catch (NumberFormatException e) {
            // Handle the exception generated from the method
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle NumberFormatException
        demo.handleException(userInput);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
