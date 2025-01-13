/*
Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

*/

import java.util.Scanner;

// Creating class CustomStringIndexOutOfBoundsException that contains methods to generate and handle StringIndexOutOfBoundsException.
public class CustomStringIndexOutOfBoundsException 
{

    // Method to generate StringIndexOutOfBoundsException
    public void generateException(String input) 
	{
        // Creating String variable text and initializing it with user input
        String text = input;
        // Accessing an index beyond the length of the String to generate StringIndexOutOfBoundsException
        System.out.println(text.charAt(text.length() + 1)); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public void handleException(String input) 
	{
        // Creating String variable text and initializing it with user input
        String text = input;
        try 
		{
            // Accessing an index beyond the length of the String to generate StringIndexOutOfBoundsException
            System.out.println(text.charAt(text.length() + 1)); // This will throw StringIndexOutOfBoundsException
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            // Catch the StringIndexOutOfBoundsException and print an informative message
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
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

        // Creating an instance of CustomStringIndexOutOfBoundsException
        CustomStringIndexOutOfBoundsException demo = new CustomStringIndexOutOfBoundsException();

        // Call the method to generate StringIndexOutOfBoundsException
        try 
		{
            demo.generateException(userInput);
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            // Print message if exception occurs
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle StringIndexOutOfBoundsException
        demo.handleException(userInput);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
